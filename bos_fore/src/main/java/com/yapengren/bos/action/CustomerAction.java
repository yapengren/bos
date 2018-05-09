package com.yapengren.bos.action;

import com.yapengren.bos.utils.CheckCodeUtils;
import com.yapengren.bos.utils.MailUtils;
import com.yapengren.bos.utils.action.BaseAction;
import com.yapengren.crm.service.impl.Customer;
import com.yapengren.crm.service.impl.CustomerServiceImpl;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.core.JmsTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Results({
	@Result(name="toSuccess", type="redirect", location="/signup-success.html"),
	@Result(name="toRegist", type="redirect", location="/signup.html"),
	@Result(name="toLogin", type="redirect", location="/login.html"),
	@Result(name="error", location="/error.jsp"),
	@Result(name="toIndex", type="redirect", location="/index.html")
	})
public class CustomerAction extends BaseAction<Customer> {
	
	@Autowired
	private CustomerServiceImpl cs;
	
	@Autowired
	private RedisTemplate rt;

	@Autowired
    private JmsTemplate jt;
	
	//发送验证码的原因
	private String checkCodeType;
	
	//接收表单提交的验证码
	private String checkCode;
	
	//接收邮箱激活码
	private String activeCode;
	
	//接收邮箱登录表单图片验证码
	private String validateCode;
	
	//登录方式标识
	private Integer article;

    /**
	 * @Title: sendCheckCode  
	 * @Description: TODO 发送注册验证码短信
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CustomerAction_sendCheckCode")
	public String sendCheckCode() {
		//创建一个用于json 提示信息的map
		Map map = new HashMap();
		
		if (checkCodeType.equals("regist")) {
			//调用ws 校验手机号是否重复
			Customer existCustomer = cs.findByTelephone(model.getTelephone());
			if (existCustomer != null) {
				//手机号重复 => 将错误信息发送到页面提示
				map.put("type", "error");
				map.put("msg", "手机号已经注册！");

				map2Client(map);

				return null;
			} 
		}
		//生成随机验证码
		String checkCode = CheckCodeUtils.getCheckCode(6);
		
		//将验证码发送到手机
		//如果发短信，请将此处放开
		//SmsUtils.sendSms(model.getTelephone(), checkCode);
		System.out.println("bos_fore项目CustomerAction测试_注册验证码      " + checkCode);
		
		//将验证码存入session
		ServletActionContext.getRequest().getSession().setAttribute(model.getTelephone(), checkCode);
		
		//向前台发送成功的提示信息
		map.put("type", "success");
		map.put("msg", "ok");
		
		map2Client(map);
		
		return null;
	}
	
	/**  
	 * @Title: checkEmail  
	 * @Description: TODO 检验邮箱是否重复
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CustomerAction_checkEmail")
	public String checkEmail() {
		//创建一个用于json 提示信息的map
		Map map = new HashMap();
		
		//调用ws， 检验邮箱是否重复
		Customer existCustomer = cs.findByEmail(model.getEmail());
		
		if (existCustomer != null) {
			//邮箱重复 => 将错误信息发送到页面提示
			map.put("type", "error");
			map.put("msg", "邮箱已经注册！");
			
			map2Client(map);
			
			return null;
		}
		//向前台发送成功的提示信息
		map.put("type", "success");
		map.put("msg", "ok");
		
		map2Client(map);
		
		return null;
	}
	
	/**  
	 * @Title: regist  
	 * @Description: TODO 用户注册
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CustomerAction_regist")
	public String regist() {
		//校验手机验证码
		//取出session 中的验证码
		String checkCodeSession = (String) ServletActionContext.getRequest().getSession().getAttribute(model.getTelephone());
		
		//比对 <页面获取的验证码> 和 <session 中的验证码
		if (checkCode.equals(checkCodeSession)) {
			//发送激活邮件
			//生成激活码
			String activeCode = UUID.randomUUID().toString();
			
			//发送激活邮件
			String subject = "账号激活";    //邮件主题
			String activeAddress = "http://localhost:8112/bos_fore/CustomerAction_active.action?activeCode=" + activeCode + "&email=" + model.getEmail();    //激活路径
			String content = "尊敬的用户您好，请在24小时内点击此链接以完成激活<br><a href='"+activeAddress+"'>"+activeAddress+"</a><br><br>激活遇到问题？ 请联系我们 yapeng0828@163.com";    //邮件内容
			MailUtils.sendMail(subject, content, model.getEmail());

            //发送消息

            /*
            jt.send("bos_fore.mail", new MessageCreator() {

                @Override
                public Message createMessage(Session session) throws JMSException {

                    MapMessage message = session.createMapMessage();
                    message.setString("title", subject);

                    message.setString("content", content);

                    message.setString("to", model.getEmail());
                    return message;
                }
            });
            */
			
			//存入redis => 有效1天
			rt.opsForValue().set(model.getEmail(), activeCode, 1, TimeUnit.DAYS);
			
			//指定客户为未激活状态
			model.setType(0);
			
			//调用ws 保存客户
			cs.save(model);
			
			//成功 => 重定向到注册成功页面
			return "toSuccess";
		} else {
			//失败 => 重定向到注册页面
			return "toRegist";
		}
	}
	
	/**  
	 * @Title: active  
	 * @Description: TODO 激活邮箱
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CustomerAction_active")
	public String active() {
		//接收参数中的邮箱 | 激活码
		String activeCode2 = (String) rt.opsForValue().get(model.getEmail());
		
		//根据邮箱从redis 中取出激活码，并移除
		rt.opsForValue().set(model.getEmail(), "", 1, TimeUnit.MICROSECONDS);
		
		//比对激活码是否一致
		if (activeCode2 == null || !activeCode2.equals(activeCode)) {
			//不一致 => 转发到错误页面提示，激活码已经过期或者已经激活
			ServletActionContext.getRequest().setAttribute("msg", "激活码过期或已经激活");
			return "error";
		}
		
		//一致 => 调用ws 修改激活状态
		cs.active(model.getEmail());
		
		return "toLogin";
	}
	
	/**  
	 * @Title: login  
	 * @Description: TODO 登录
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CustomerAction_login")
	public String login() {
		//判断当前登录方式
		if (article == 0) {
			//邮箱登录
			return loginByEmailAndPassword();
		} else {
			//手机号登录
			return loginByTelephone();
		}
	}

	/**  
	 * @Title: loginByTelephone  
	 * @Description: TODO 手机号登录
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	private String loginByTelephone() {
		//校验验证码 => 取出session 中的验证码
		String checkCodeSession = (String) ServletActionContext.getRequest().getSession().getAttribute(model.getTelephone());
		
		//表单验证码与session 验证码比对
		if (!checkCode.equals(checkCodeSession)) {
			//失败 => 提示
			ServletActionContext.getRequest().setAttribute("msg", "手机验证码错误！");
			return "error";
		}
		
		//根据手机号获得客户
		Customer c = cs.findByTelephone(model.getTelephone());
		
		if (c == null) {
			//获取不到 => 请先注册
			ServletActionContext.getRequest().setAttribute("msg", "手机号未注册！");
			return "error";
		}
		
		//判断用户是否已经激活
		if (c.getType() != 1) {
			//未激活 => 请先激活再登录
			ServletActionContext.getRequest().setAttribute("msg", "请先激活再登录！");
			return "error";
		}
		
		//将客户放入session 作为登录标识
		ServletActionContext.getRequest().getSession().setAttribute("customer", c);
		
		//重定向到首页
		return "toIndex";
	}

	/**  
	 * @Title: loginByEmailAndPassword  
	 * @Description: TODO 邮箱 | 密码登录
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	private String loginByEmailAndPassword() {
		//从session 获取到图片验证码
		String validateCode2 = (String) ServletActionContext.getRequest().getSession().getAttribute("validateCode");
		
		//表单校验码与session 验证码比对
		if (validateCode2 == null || !validateCode2.equalsIgnoreCase(validateCode)) {
			//验证码比对失败
			ServletActionContext.getRequest().setAttribute("msg", "验证码错误！");
			return "error";
		}
		
		//调用ws 根据账户&密码取出客户对象
		Customer c = cs.findByEmailAndPassword(model.getEmail(), model.getPassword());
		
		//判断用户名密码是否正确
		if (c == null) {
			//未取出 => 用户名或密码不正确
			ServletActionContext.getRequest().setAttribute("msg", "用户名或密码不正确！");
			return "error";
		}
		
		//判断用户是否已经激活
		if (c.getType() != 1) {
			//未激活 => 请先激活再登录
			ServletActionContext.getRequest().setAttribute("msg", "请先激活再登录！");
			return "error";
		}
		
		//将客户放入session 作为登录标识
		ServletActionContext.getRequest().getSession().setAttribute("customer", c);
		
		//重定向到首页
		return "toIndex";
	}

	public String getCheckCodeType() {
		return checkCodeType;
	}

	public void setCheckCodeType(String checkCodeType) {
		this.checkCodeType = checkCodeType;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public Integer getArticle() {
		return article;
	}

	public void setArticle(Integer article) {
		this.article = article;
	}
	
}

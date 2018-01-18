package com.yapengren.bos.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.yapengren.bos.utils.CheckCodeUtils;
import com.yapengren.bos.utils.action.BaseAction;
import com.yapengren.crm.service.impl.Customer;
import com.yapengren.crm.service.impl.CustomerServiceImpl;

@Results({
	@Result(name="toSuccess", type="redirect", location="/signup-success.html"),
	@Result(name="toRegist", type="redirect", location="/signup.html")
	})
public class CustomerAction extends BaseAction<Customer> {
	
	@Autowired
	private CustomerServiceImpl cs;
	
	//发送验证码的原因
	private String checkCodeType;
	
	//接收表单提交的验证码
	private String checkCode;
	
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
		ServletActionContext.getRequest().getSession().putValue("checkCode", checkCode);
		
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
			//String activeCode = UUID.randomUUID().toString();
			//发送激活邮件
			
			//成功 => 重定向到注册成功页面
			return "toSuccess";
		} else {
			//失败 => 重定向到注册页面
			return "toRegist";
		}
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
	
}

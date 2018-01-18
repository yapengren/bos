package com.yapengren.bos.web.base.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.yapengren.bos.domain.base.Courier;
import com.yapengren.bos.service.base.CourierService;
import com.yapengren.bos.utils.action.BaseAction;

//返回结果
@Results({@Result(name="toList", type="redirect", location="/pages/base/courier.html")})
public class CourierAction extends BaseAction<Courier> {
	
	//
	private String ids;
	
	@Autowired
	private CourierService cs;
	 
	/**  
	 * @Title: add  
	 * @Description: TODO 添加或修改快递员
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CourierAction_add")
	public String add() {
		cs.save(model);
		return "toList";
	}
	
	/**  
	 * @Title: pageList  
	 * @Description: TODO 快递员分页列表
	 * @param @return
	 * @param @throws IOException
	 * @return String
	 * @throws  
	 */  
	@Action("CourierAction_pageList")
	public String pageList() throws IOException {
		
		//拼装参数
		Specification<Courier> spec = new Specification<Courier>() {
			
			/*
			 	参数1：Root<Courier> root    代表Courier 对象
			 	参数2：CriteriaQuery<?> query    没用
			 	参数3： CriteriaBuilder cb    添加条件使用
			 */
			@Override
			public Predicate toPredicate(Root<Courier> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				//封装条件的集合
				List list = new ArrayList<>();
				
				//判断工号是否提交
				if (StringUtils.isNotBlank(model.getCourierNum())) {
					//参数1：表达属性名
					//参数2：表达属性值
					list.add(cb.equal(root.get("courierNum").as(String.class), model.getCourierNum()));
				}
				
				//判断所属单位是否提交
				if (StringUtils.isNotBlank(model.getCompany())) {
					list.add(cb.like(root.get("company").as(String.class), model.getCompany()));
				}
				
				//判断类型是否提交
				if (StringUtils.isNotBlank(model.getType())) {
					list.add(cb.like(root.get("type").as(String.class), model.getType()));
				}
				
				//判断收派标准是否提交
				if (model.getStandard() != null && model.getStandard().getId() != null) {
					//关联查询
					Join<Object, Object> join = root.join("standard");
					
					list.add(cb.equal(join.get("id").as(Integer.class), model.getStandard().getId()));
				}
				
				//如果一个条件都没有
				if (list.size() == 0) {
					//没有条件
					return null;
				} else {
					//将list 转换为数组
					Predicate[] params = new Predicate[list.size()];
					list.toArray(params);
					
					//将条件数组放入and 方法
					return cb.and(params);
				}
			}
		};
		
		//调用service 查询 pageBean
		Page<Courier> pageBean = cs.findPageBean(spec, page, rows);
		
		//将pageBean 转换为 json
		Map pageMap = new HashMap<>();
		
		pageMap.put("total", pageBean.getTotalElements());
		pageMap.put("rows", pageBean.getContent());
		
		/*
		解决no session问题：
			方案1：立即加载
			方案2：不用未加载的属性
			方案3：扩大session 的作用范围
		*/
		/*
	 	{
		 	"rows":
			 	[
			 		{"checkPwd":"12345","company":"北京分部","courierNum":"09382","fixedAreas":[],"id":41,"name":"张三","pda":"12345","standard":{"id":3,"maxLength":30,"maxWeight":30,"minLength":20,"minWeight":20,"name":"大件快递"},"telephone":"18555558888","type":"大件员","vehicleNum":"12345","vehicleType":"箱货"}
			 	],
		 	"total":1
	 	}
		 */
		
		//创建生成属性过滤器，json 中不生成standard 属性
		SimplePropertyPreFilter filter = new SimplePropertyPreFilter();
		filter.getExcludes().add("takeTime");
		filter.getExcludes().add("fixedAreas");
		
		//禁止回环引用，多次生成同一个对象的json 时，每次都正常生成
		String json = JSON.toJSONString(pageMap, filter, SerializerFeature.DisableCircularReferenceDetect);
		
		//将json发送到浏览器
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(json);
		return null;
	}
	
	/**  
	 * @Title: findAll  
	 * @Description: TODO 查询所有快递员 
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CourierAction_findAll")
	public String findAll() {
		//调用service 查询pageBean
		Page<Courier> pageBean = cs.findPageBean(1, Integer.MAX_VALUE);
		
		//将page 发送到浏览器
		list2Client(pageBean.getContent(), "takeTime", "fixedAreas");
		
		return null;
	}
	
	/**  
	 * @Title: delete  
	 * @Description: TODO 作废快递员
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CourierAction_delete")
	public String delete() {
		//将参数ids 切割为 Integer数组
		String[] idsStrArray = ids.split(",");
		
		Integer[] idsArray = new Integer[idsStrArray.length];
		
		for (int i = 0; i < idsStrArray.length; i++) {
			idsArray[i] = Integer.parseInt(idsStrArray[i]);
		}
		
		//调用service
		cs.delete(idsArray);
		return null;
	}
	
	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
	
}

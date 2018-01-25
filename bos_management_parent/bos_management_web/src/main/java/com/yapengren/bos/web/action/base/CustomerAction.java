package com.yapengren.bos.web.action.base;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.yapengren.bos.utils.action.BaseAction;
import com.yapengren.crm.service.impl.Customer;
import com.yapengren.crm.service.impl.CustomerServiceImpl;

//返回结果
@Results({@Result(name="toList", type="redirect", location="/pages/base/fixed_area.html")})
public class CustomerAction extends BaseAction<Customer> {
	
	@Autowired
	private CustomerServiceImpl cs;
	
	//接收多个客户id
	private List<Integer> customerIds;
	
	/**  
	 * @Title: getUnLinkedCustomers  
	 * @Description: TODO 返回所有未与定区关联的客户
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CustomerAction_getUnLinkedCustomers")
	public String getUnLinkedCustomers() {
		//调用ws 查询未关联定区客户
		List<Customer> list = cs.getUnLinkedCustomers();
		
		//将返回客户列表转换为json， 并发送到浏览器
		list2Client(list);
		
		return null;
	}
	
	/**  
	 * @Title: getLinkedCustomers  
	 * @Description: TODO 与指定定区关联的客户
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CustomerAction_getLinkedCustomers")
	public String getLinkedCustomers() {
		//调用ws 查询关联定区客户
		List<Customer> list = cs.getLinkedCustomers(model.getFixedAreaId());
		
		//将返回客户列表转换为json， 并发送到浏览器
		list2Client(list);
		
		return null;
	}
	
	/**  
	 * @Title: linkCustomers  
	 * @Description: TODO 定区关联客户
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("CustomerAction_linkCustomers")
	public String linkCustomers() {
		//调用ws， 定区关联客户
		cs.fixedAreaLinkCustomers(model.getFixedAreaId(), customerIds);
		
		return "toList";
	}

	public List<Integer> getCustomerIds() {
		return customerIds;
	}

	public void setCustomerIds(List<Integer> customerIds) {
		this.customerIds = customerIds;
	}
	
}

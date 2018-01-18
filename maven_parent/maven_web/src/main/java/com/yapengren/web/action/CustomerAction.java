package com.yapengren.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.yapengren.domain.Customer;
import com.yapengren.service.CustomerService;

@Controller
@Scope("prototype")

@ParentPackage("struts-default")
@Namespace("/")
public class CustomerAction extends ActionSupport {
	
	@Autowired
	private CustomerService customerService;
	
	//
	private int custId;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	//
	private Customer cus;
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	
	@Action(value="findById", results={@Result(name="findById", location="/success.jsp")})
	public String findById() {
		cus = customerService.findById(custId);
		return "findById";
	}
}

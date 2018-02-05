package com.yapengren.bos.web.action.base;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yapengren.bos.domain.base.Standard;
import com.yapengren.bos.service.base.StandardService;

//注册bean
@Controller
//作用域
@Scope("prototype")

//父包
@ParentPackage("struts-default")
//命名空间
@Namespace("/")
//返回结果
@Results({@Result(name="toList", type="redirect", location="/pages/base/standard.html")})
public class StandardAction extends ActionSupport implements ModelDriven<Standard> {
	
	private Standard standard = new Standard();
	
	//
	private Integer page;
	//
	private Integer rows;
	
	@Autowired
	private StandardService ss;
	
	/**  
	 * @Title: standard_add  
	 * @Description: TODO 添加或者修改收派标准
	 * @param @return
	 * @return String
	 * @throws  
	 */
	@Action("StandardAction_add")
	public String add() {
		ss.save(standard);
		return "toList";
	}
	
	/**
	 * @throws IOException   
	 * @Title: pageList  
	 * @Description: TODO 收派标准分页列表
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("StandardAction_pageList")
	public String pageList() throws IOException {
		//调用service 查询 pageBean
		Page<Standard> pageBean = ss.findPageBean(page, rows);
		
		//将pageBean 转换为 json
		Map pageMap = new HashMap<>();
		
		pageMap.put("total", pageBean.getTotalElements());
		pageMap.put("rows", pageBean.getContent());
		
		String json = JSON.toJSONString(pageMap);
		
		/*
		 * 不放进map集合，测试输出json为：
		{
			"content":[
				{"id":3,"name":"大件快递"},
				{"id":4,"name":"超大快递"},
				{"id":5,"name":"宇宙快递"},
				{"id":1,"maxLength":10,"maxWeight":10,"minLength":0,"minWeight":0,"name":"小件快递"},
				{"id":2,"name":"中件快递"}
			],
			"first":true,
			"last":true,
			"number":0
			,"numberOfElements":5,
			"size":30,
			"totalElements":5,
			"totalPages":1
		}
		*/
		
		/*
		 * 放进map集合，测试输出json为
		 {
		 "rows":[
			 {"id":3,"name":"大件快递"},
			 {"id":4,"name":"超大快递"},
			 {"id":5,"name":"宇宙快递"},
			 {"id":1,"maxLength":10,"maxWeight":10,"minLength":0,"minWeight":0,"name":"小件快递"},
			 {"id":2,"name":"中件快递"}],
		 "total":5
		 }

		 */
		
		//将json发送到浏览器
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(json);
		return null;
	}
	
	/**
	 * @throws IOException   
	 * @Title: findAll  
	 * @Description: TODO 查询所有取派标准
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("StandardAction_findAll")
	public String findAll() throws IOException {
		//调用 service 查询所有取派标准
		Page<Standard> pageBean = ss.findPageBean(1, Integer.MAX_VALUE);
		
		//将pageBean 转换为 json
		String json = JSON.toJSONString(pageBean.getContent());
		
		//将 json 发送到浏览器
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(json);
		
		return null;
	}

	@Override
	public Standard getModel() {
		return standard;
	}
	
	public Integer getPage() {
		return page;
	}
	
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public Integer getRows() {
		return rows;
	}
	
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
}

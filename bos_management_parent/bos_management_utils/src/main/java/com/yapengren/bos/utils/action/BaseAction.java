package com.yapengren.bos.utils.action;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//注册bean
@Controller
// 作用域
@Scope("prototype")

// 父包
@ParentPackage("struts-default")
// 命名空间
@Namespace("/")
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	protected T model;

	/**
	 * ActionSupport & ModelDriven
	 * 
	 */
	public BaseAction() {
		// 获得T 的类型
		ParameterizedType sc = (ParameterizedType) this.getClass().getGenericSuperclass();

		// 获得泛型类型
		Class clazz = (Class) sc.getActualTypeArguments()[0];

		// 初始化model
		try {
			model = (T) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	/**  
	 * @Title: page2Client  
	 * @Description: TODO 将page 对象转换为json 发送到浏览器
	 * @param @param pageBean 需要发送到浏览器的page 对象
	 * @param @param excludeAttrs
	 * @return void
	 * @throws  
	 */  
	public void page2Client(Page<T> pageBean, String... excludeAttrs) {
		//将pageBean 转换为 json
		Map pageMap = new HashMap<>();
		
		pageMap.put("total", pageBean.getTotalElements());
		pageMap.put("rows", pageBean.getContent());
		
		//创建生成属性过滤器，json 中不生成Standard 属性
		SimplePropertyPreFilter filter = new SimplePropertyPreFilter();
		filter.getExcludes().addAll(Arrays.asList(excludeAttrs));
		
		//禁止回环引用，多次生成同一个对象的json 时，每次都正常生成
		String json = JSON.toJSONString(pageMap, filter, SerializerFeature.DisableCircularReferenceDetect);
		
		//将json 发送到浏览器
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		try {
			ServletActionContext.getResponse().getWriter().write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**  
	 * @Title: list2Client  
	 * @Description: TODO 将list 对象转换为json 发送到浏览器
	 * @param @param list 需要发送到浏览器的list
	 * @param @param excludeAttrs 实体忽略哪些属性（不生成到json 中）
	 * @return void
	 * @throws  
	 */  
	public void list2Client(List list, String... excludeAttrs) {
		//创建生成属性过滤器，json 中不生成Standard属性
		SimplePropertyPreFilter filter  = new SimplePropertyPreFilter();
		filter.getExcludes().addAll(Arrays.asList(excludeAttrs));
		
		//转换为json 
		String json = JSON.toJSONString(list, filter, SerializerFeature.DisableCircularReferenceDetect);
		
		//将json 发送到浏览器
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		try {
			ServletActionContext.getResponse().getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void map2Client(Map pageMap) {
		String json = JSON.toJSONString(pageMap);
		
		//将json 发送到浏览器
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		try {
			ServletActionContext.getResponse().getWriter().write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public T getModel() {
		return model;
	}

	// 当前页数
	protected Integer page;

	// 每页显示个数
	protected Integer rows;

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

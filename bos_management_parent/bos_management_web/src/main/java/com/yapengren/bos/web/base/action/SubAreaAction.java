package com.yapengren.bos.web.base.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
import org.springframework.transaction.support.ResourceTransactionManager;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yapengren.bos.domain.base.Area;
import com.yapengren.bos.domain.base.SubArea;
import com.yapengren.bos.service.base.AreaService;
import com.yapengren.bos.service.base.SubAreaService;
import com.yapengren.bos.utils.PinYin4jUtils;
import com.yapengren.bos.utils.action.BaseAction;

//返回结果
@Results({@Result(name="toList", type="redirect", location="/pages/base/sub_area.html")})
public class SubAreaAction extends BaseAction<SubArea> {
	
	@Autowired
	private SubAreaService sas;
	
	/**  
	 * @Title: add  
	 * @Description: TODO 添加分区
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("SubAreaAction_add")
	public String add() {
		sas.save(model);
		return "toList";
	}
	
	@Action("SubAreaAction_pageList")
	public String pageList() {
		Page<SubArea> pageBean = sas.findPage(page, rows);
		
		page2Client(pageBean, "fixedArea", "subareas");
		
		return null;
	}
}

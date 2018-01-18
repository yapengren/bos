package com.yapengren.web.base.action;

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
import com.yapengren.domain.base.Courier;
import com.yapengren.domain.base.TakeTime;
import com.yapengren.service.base.CourierService;
import com.yapengren.service.base.TakeTimeService;
import com.yapengren.utils.action.BaseAction;

//返回结果
@Results({@Result(name="toList", type="redirect", location="/pages/base/take_time.html")})
public class TakeTimeAction extends BaseAction<TakeTime> {
	
	@Autowired
	private TakeTimeService tts;
	 
	@Action("TakeTimeAction_findAll")
	public String findAll() {
		List<TakeTime> list = tts.findAll();
		
		list2Client(list);
		
		return null;
	}
}

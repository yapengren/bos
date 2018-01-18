package com.yapengren.service.base.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.dao.base.CourierDao;
import com.yapengren.dao.base.FixedAreaDao;
import com.yapengren.dao.base.TakeTimeDao;
import com.yapengren.domain.base.Courier;
import com.yapengren.domain.base.FixedArea;
import com.yapengren.domain.base.TakeTime;
import com.yapengren.service.base.FixedAreaService;

@Service
@Transactional
public class FixedAreaServiceImpl implements FixedAreaService {

	@Autowired
	private FixedAreaDao fad;
	
	@Autowired
	private CourierDao cd;
	
	@Autowired
	private TakeTimeDao ttd;

	/* 
	 * Title: save 
	 * Description: 保存定区
	 * @param model  
	 * @see com.yapengren.service.base.FixedAreaService#save(com.yapengren.domain.base.FixedArea)  
	 */  
	@Override
	public void save(FixedArea model) {
		fad.save(model);
	}

	/* 
	 * Title: findPage 
	 * Description: 查询所有定区
	 * @param page
	 * @param rows
	 * @return  
	 * @see com.yapengren.service.base.FixedAreaService#findPage(java.lang.Integer, java.lang.Integer)  
	 */  
	@Override
	public Page<FixedArea> findPage(Integer page, Integer rows) {
		return fad.findAll(new PageRequest(page - 1, rows));
	}

	/* 
	 * Title: linkCourier 
	 * Description: 定区关联快递员 & 收派时间
	 * @param id
	 * @param courierId
	 * @param takeTimeId  
	 * @see com.yapengren.service.base.FixedAreaService#linkCourier(java.lang.String, java.lang.Integer, java.lang.Integer)  
	 */  
	@Override
	public void linkCourier(String id, Integer courierId, Integer takeTimeId) {
		//查询对象
		FixedArea fa = fad.findOne(id);
		Courier c = cd.findOne(courierId);
		TakeTime tt = ttd.findOne(takeTimeId);
		
		//表达关系
		//定区关联快递员
		fa.getCouriers().add(c);
		//快递员关联收派时间
		c.setTakeTime(tt);
	}

}

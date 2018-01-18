package com.yapengren.service.base.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.dao.base.StandardDao;
import com.yapengren.domain.base.Standard;
import com.yapengren.service.base.StandardService;

@Service
@Transactional
public class StandardServiceImpl implements StandardService {
	
	@Autowired
	private StandardDao sd;

	/* 
	 * Title: save 
	 * Description: 添加或者修改收派标准
	 * @param standard  
	 * @see com.yapengren.service.base.StandardService#save(com.yapengren.domain.base.Standard)  
	 */  
	@Override
	public void save(Standard standard) {
		sd.save(standard);
	}

	/* 
	 * Title: findPageBean 
	 * Description: 收派标准分页列表 
	 * @param page
	 * @param rows
	 * @return  
	 * @see com.yapengren.service.base.StandardService#findPageBean(java.lang.Integer, java.lang.Integer)  
	 */  
	@Override
	public Page<Standard> findPageBean(Integer page, Integer rows) {
		return sd.findAll(new PageRequest(page - 1, rows));
	}
	
}

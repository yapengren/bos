package com.yapengren.service.base.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.dao.base.FixedAreaDao;
import com.yapengren.domain.base.FixedArea;
import com.yapengren.service.base.FixedAreaService;

@Service
@Transactional
public class FixedAreaServiceImpl implements FixedAreaService {

	@Autowired
	private FixedAreaDao fad;

	/* 
	 * Title: save 
	 * Description: 
	 * @param model  
	 * @see com.yapengren.service.base.FixedAreaService#save(com.yapengren.domain.base.FixedArea)  
	 */  
	@Override
	public void save(FixedArea model) {
		fad.save(model);
	}

	/* 
	 * Title: findPage 
	 * Description: 
	 * @param page
	 * @param rows
	 * @return  
	 * @see com.yapengren.service.base.FixedAreaService#findPage(java.lang.Integer, java.lang.Integer)  
	 */  
	@Override
	public Page<FixedArea> findPage(Integer page, Integer rows) {
		return fad.findAll(new PageRequest(page - 1, rows));
	}

}

package com.yapengren.service.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.dao.base.AreaDao;
import com.yapengren.domain.base.Area;
import com.yapengren.service.base.AreaService;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	private AreaDao ad;

	@Override
	public void saveAll(List<Area> list) {
		ad.save(list);
	}

	@Override
	public Page<Area> findPageBean(Integer page, Integer rows) {
		return ad.findAll(new PageRequest(page - 1, rows));
	}

	/* 
	 * Title: findByCondition 
	 * Description: 根据城市编码 | 简码模糊查询
	 * @param q
	 * @return  
	 * @see com.yapengren.service.base.AreaService#findByCondition(java.lang.String)  
	 */  
	@Override
	public List<Area> findByCondition(String q) {
		return ad.findByCondition("%" + q.toLowerCase() + "%", "%" + q.toUpperCase() + "%");
	}

}

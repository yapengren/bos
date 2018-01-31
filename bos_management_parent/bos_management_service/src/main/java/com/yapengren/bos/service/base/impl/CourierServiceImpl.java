package com.yapengren.bos.service.base.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.bos.dao.base.CourierDao;
import com.yapengren.bos.domain.base.Courier;
import com.yapengren.bos.service.base.CourierService;

@Service
@Transactional
public class CourierServiceImpl implements CourierService {
	
	@Autowired
	private CourierDao cd;

	/* 
	 * Title: save 
	 * Description: 添加或修改快递员
	 * @param courier  
	 * @see com.yapengren.service.base.CourierService#save(com.yapengren.domain.base.Courier)  
	 */  
	@Override
	public void save(Courier courier) {
		cd.save(courier);
	}

	/* 
	 * Title: findPageBean 
	 * Description: 快递员分页列表
	 * @param page
	 * @param rows
	 * @return  
	 * @see com.yapengren.service.base.CourierService#findPageBean(java.lang.Integer, java.lang.Integer)  
	 */  
	@Override
	public Page<Courier> findPageBean(Integer page, Integer rows) {
		return cd.findAll(new PageRequest(page - 1, rows));
	}

	/* 
	 * Title: findPageBean 
	 * Description: 快递员分页条件查询
	 * @param spec
	 * @param page
	 * @param rows
	 * @return  
	 * @see com.yapengren.service.base.CourierService#findPageBean(org.springframework.data.jpa.domain.Specification, java.lang.Integer, java.lang.Integer)  
	 */  
	@Override
	public Page<Courier> findPageBean(Specification<Courier> spec, Integer page, Integer rows) {
		return cd.findAll(spec, new PageRequest(page - 1, rows));
	}

	/* 
	 * Title: delete 
	 * Description: 作废快递员
	 * @param idsArray  
	 * @see com.yapengren.service.base.CourierService#delete(java.lang.Integer[])  
	 */  
	@Override
	public void delete(Integer ... idsArray) {
		for (Integer id : idsArray) {
			cd.delete4DelTag(id);
		}
	}

	/**
	 * 根据id 查询快递员
	 *
	 * @param id
	 */
	public Courier findById(Integer id) {
		return cd.findOne(id);
	}

}

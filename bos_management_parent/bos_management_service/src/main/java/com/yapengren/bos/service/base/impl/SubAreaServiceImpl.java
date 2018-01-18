package com.yapengren.bos.service.base.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.bos.dao.base.SubAreaDao;
import com.yapengren.bos.domain.base.SubArea;
import com.yapengren.bos.service.base.SubAreaService;

@Service
@Transactional
public class SubAreaServiceImpl implements SubAreaService {

	@Autowired
	private SubAreaDao sad;
	
	@Override
	public void save(SubArea model) {
		sad.save(model);
	}

	@Override
	public Page<SubArea> findPage(Integer page, Integer rows) {
		return sad.findAll(new PageRequest(page - 1, rows));
	}

}

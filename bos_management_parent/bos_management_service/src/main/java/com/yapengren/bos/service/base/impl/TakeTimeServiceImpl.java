package com.yapengren.bos.service.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.bos.dao.base.TakeTimeDao;
import com.yapengren.bos.domain.base.TakeTime;
import com.yapengren.bos.service.base.TakeTimeService;

@Service
@Transactional
public class TakeTimeServiceImpl implements TakeTimeService {
	
	@Autowired
	private TakeTimeDao ttd;

	@Override
	public List<TakeTime> findAll() {
		return ttd.findAll();
	}
}

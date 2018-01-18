package com.yapengren.service.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.dao.base.TakeTimeDao;
import com.yapengren.domain.base.TakeTime;
import com.yapengren.service.base.TakeTimeService;

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

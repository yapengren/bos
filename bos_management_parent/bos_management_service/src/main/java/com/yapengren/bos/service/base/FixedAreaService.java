package com.yapengren.bos.service.base;

import org.springframework.data.domain.Page;

import com.yapengren.bos.domain.base.FixedArea;

public interface FixedAreaService {

	void save(FixedArea model);

	Page<FixedArea> findPage(Integer page, Integer rows);

	void linkCourier(String id, Integer courierId, Integer takeTimeId);

}

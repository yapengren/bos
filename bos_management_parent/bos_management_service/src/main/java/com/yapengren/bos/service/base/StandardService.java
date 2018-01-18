package com.yapengren.bos.service.base;

import org.springframework.data.domain.Page;

import com.yapengren.bos.domain.base.Standard;

public interface StandardService {

	void save(Standard standard);

	Page<Standard> findPageBean(Integer page, Integer rows);

}

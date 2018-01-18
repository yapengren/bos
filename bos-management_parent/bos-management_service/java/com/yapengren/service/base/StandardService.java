package com.yapengren.service.base;

import org.springframework.data.domain.Page;

import com.yapengren.domain.base.Standard;

public interface StandardService {

	void save(Standard standard);

	Page<Standard> findPageBean(Integer page, Integer rows);

}

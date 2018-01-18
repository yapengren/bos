package com.yapengren.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;

import com.yapengren.domain.base.Courier;

public interface CourierService {

	void save(Courier courier);

	Page<Courier> findPageBean(Integer page, Integer rows);
	
	Page<Courier> findPageBean(Specification<Courier> spec, Integer page, Integer rows);

	void delete(Integer[] idsArray);
	
}

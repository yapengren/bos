package com.yapengren.service.base;

import java.util.List;

import org.springframework.data.domain.Page;

import com.yapengren.domain.base.Area;

public interface AreaService {

	void saveAll(List<Area> list);

	Page<Area> findPageBean(Integer page, Integer rows);

	List<Area> findByCondition(String q);

}

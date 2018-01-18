package com.yapengren.bos.service.base;

import org.springframework.data.domain.Page;

import com.yapengren.bos.domain.base.SubArea;

public interface SubAreaService {

	void save(SubArea model);

	Page<SubArea> findPage(Integer page, Integer rows);

}

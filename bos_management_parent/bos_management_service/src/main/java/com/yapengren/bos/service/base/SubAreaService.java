package com.yapengren.bos.service.base;

import com.yapengren.bos.domain.base.FixedArea;
import org.springframework.data.domain.Page;

import com.yapengren.bos.domain.base.SubArea;

import java.util.List;

public interface SubAreaService {

	void save(SubArea model);

	Page<SubArea> findPage(Integer page, Integer rows);

	List<SubArea> findByFixedAreaId(FixedArea fixedArea);
}

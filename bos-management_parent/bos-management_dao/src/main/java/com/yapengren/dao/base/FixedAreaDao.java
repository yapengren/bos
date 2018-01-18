package com.yapengren.dao.base;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yapengren.domain.base.FixedArea;

public interface FixedAreaDao extends JpaRepository<FixedArea, String> {
	
}

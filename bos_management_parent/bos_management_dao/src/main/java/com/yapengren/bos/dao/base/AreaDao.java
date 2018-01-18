package com.yapengren.bos.dao.base;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yapengren.bos.domain.base.Area;

public interface AreaDao extends JpaRepository<Area, String> {
	
	@Query("from Area where citycode like ? or shortcode like ? ")
	List<Area> findByCondition(String q1, String q2);
	
}

package com.yapengren.dao.base;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yapengren.domain.base.Standard;

public interface StandardDao extends JpaRepository<Standard, Integer> {
	
}

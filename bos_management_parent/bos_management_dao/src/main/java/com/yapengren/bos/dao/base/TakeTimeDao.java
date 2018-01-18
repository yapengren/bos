package com.yapengren.bos.dao.base;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yapengren.bos.domain.base.Area;
import com.yapengren.bos.domain.base.TakeTime;

public interface TakeTimeDao extends JpaRepository<TakeTime, Integer> {

}

package com.yapengren.bos.dao.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.yapengren.bos.domain.base.Courier;

//JpaSpecificationExecutor 为带有条件查询的分页列表接口
public interface CourierDao extends JpaRepository<Courier, Integer>, JpaSpecificationExecutor<Courier> {

	@Modifying
	@Query("update Courier set deltag = 1 where id = ? ")
	void delete4DelTag(Integer id);
	
}

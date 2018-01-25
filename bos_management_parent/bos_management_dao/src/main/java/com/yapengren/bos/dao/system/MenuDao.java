package com.yapengren.bos.dao.system;

import com.yapengren.bos.domain.system.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuDao extends JpaRepository<Menu, Integer> {
    List<Menu> findByParentMenuIsNull();
}

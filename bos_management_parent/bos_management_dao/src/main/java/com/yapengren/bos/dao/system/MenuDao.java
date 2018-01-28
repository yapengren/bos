package com.yapengren.bos.dao.system;

import com.yapengren.bos.domain.system.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuDao extends JpaRepository<Menu, Integer> {
    List<Menu> findByParentMenuIsNull();

    @Query("select distinct m from Menu m inner join m.roles r inner join r.users u where u.id = ?")
    List<Menu> findByLoginUser(Integer id);
}

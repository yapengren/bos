package com.yapengren.bos.dao.system;

import com.yapengren.bos.domain.system.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PermissionDao extends JpaRepository<Permission, Integer> {

    @Query("select p.keyword from Permission p inner join p.roles r inner join r.users u where u.id = ? ")
    List<String> findPermissionByLoginUser(Integer id);
}

package com.yapengren.bos.dao.system;

import com.yapengren.bos.domain.system.Permission;
import com.yapengren.bos.domain.system.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
}

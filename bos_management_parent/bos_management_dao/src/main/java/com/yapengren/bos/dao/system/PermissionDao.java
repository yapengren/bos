package com.yapengren.bos.dao.system;

import com.yapengren.bos.domain.system.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDao extends JpaRepository<Permission, Integer> {
}

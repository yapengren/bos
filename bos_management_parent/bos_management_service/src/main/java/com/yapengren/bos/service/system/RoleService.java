package com.yapengren.bos.service.system;

import com.yapengren.bos.domain.system.Permission;

import java.util.List;

public interface RoleService {

    List<Permission> findAll();

    void save(Permission model);
}

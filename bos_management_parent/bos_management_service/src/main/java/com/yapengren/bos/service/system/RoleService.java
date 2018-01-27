package com.yapengren.bos.service.system;

import com.yapengren.bos.domain.system.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    void save(Role model, List<Integer> permissionIds, List<Integer> menuIdIntList);
}

package com.yapengren.bos.service.system.impl;

import com.yapengren.bos.dao.system.PermissionDao;
import com.yapengren.bos.domain.system.Permission;
import com.yapengren.bos.service.system.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao pd;

    /**
     * 查询权限列表
     * @return
     */
    @Override
    public List<Permission> findAll() {
        return pd.findAll();
    }

    /**
     * 保存权限
     * @param model
     */
    @Override
    public void save(Permission model) {
        pd.save(model);
    }
}

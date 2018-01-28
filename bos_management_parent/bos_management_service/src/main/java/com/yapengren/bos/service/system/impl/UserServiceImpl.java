package com.yapengren.bos.service.system.impl;

import com.yapengren.bos.dao.system.RoleDao;
import com.yapengren.bos.dao.system.UserDao;
import com.yapengren.bos.domain.system.Role;
import com.yapengren.bos.domain.system.User;
import com.yapengren.bos.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao ud;

    @Autowired
    private RoleDao rd;

    /**
     * 查询用户列表
     * @return
     */
    @Override
    public List<User> findAll() {
        return ud.findAll();
    }

    /**
     * 保存用户
     * @param model
     * @param roleIds
     */
    @Override
    public void save(User model, List<Integer> roleIds) {
        //查询关联的角色
        List<Role> roles = rd.findAll(roleIds);
        //表达关系
        model.getRoles().addAll(roles);
        //保存用户
        ud.save(model);

    }
}

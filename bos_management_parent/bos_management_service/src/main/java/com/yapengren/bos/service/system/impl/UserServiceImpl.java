package com.yapengren.bos.service.system.impl;

import com.yapengren.bos.dao.system.UserDao;
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

    /**
     * 查询用户列表
     * @return
     */
    @Override
    public List<User> findAll() {
        return ud.findAll();
    }
}

package com.yapengren.bos.service.system;

import com.yapengren.bos.domain.system.Menu;
import com.yapengren.bos.domain.system.User;

import java.util.List;

public interface MenuService {

    /**
     * 查询menu 数据
     * @return
     */
    List<Menu> findAll();

    /**
     * 保存菜单
     * @param model
     */
    void save(Menu model);

    /**
     * 查询登录用户的菜单
     * @param user
     * @return
     */
    List<Menu> findByLoginUser(User user);
}

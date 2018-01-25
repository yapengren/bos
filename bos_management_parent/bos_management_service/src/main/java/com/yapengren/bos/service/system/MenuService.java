package com.yapengren.bos.service.system;

import com.yapengren.bos.domain.system.Menu;

import java.util.List;

public interface MenuService {

    /**
     * 查询menu 数据
     * @return
     */
    List<Menu> findAll();

    void save(Menu model);
}

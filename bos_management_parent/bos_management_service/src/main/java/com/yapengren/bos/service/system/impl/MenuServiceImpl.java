package com.yapengren.bos.service.system.impl;

import com.yapengren.bos.dao.system.MenuDao;
import com.yapengren.bos.domain.system.Menu;
import com.yapengren.bos.service.system.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao md;

    /**
     * 查询menu 数据
     * @return
     */
    @Override
    public List<Menu> findAll() {

        return md.findByParentMenuIsNull();
    }

    /**
     * 保存菜单
     * @param model
     */
    @Override
    public void save(Menu model) {
        md.save(model);
    }
}

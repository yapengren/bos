package com.yapengren.bos.service.system.impl;

import com.yapengren.bos.dao.system.MenuDao;
import com.yapengren.bos.dao.system.PermissionDao;
import com.yapengren.bos.dao.system.RoleDao;
import com.yapengren.bos.domain.system.Menu;
import com.yapengren.bos.domain.system.Permission;
import com.yapengren.bos.domain.system.Role;
import com.yapengren.bos.service.system.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao rd;

    @Autowired
    private PermissionDao pd;

    @Autowired
    private MenuDao md;

    /**
     * 查询角色列表
     * @return
     */
    @Override
    public List<Role> findAll() {
        return rd.findAll();
    }

    /**
     * 保存角色
     * @param model
     * @param permissionIds
     * @param menuIdIntList
     */
    @Override
    public void save(Role model, List<Integer> permissionIds, List<Integer> menuIdIntList) {
        //查询所有权限
        List<Permission> permissionList = pd.findAll(permissionIds);

        //将权限放入role 中
        model.getPermissions().addAll(permissionList);

        //查询所有菜单
        List<Menu> menus = md.findAll(menuIdIntList);

        //将菜单放入role 中
        model.getMenus().addAll(menus);

        //保存role
        rd.save(model);
    }
}

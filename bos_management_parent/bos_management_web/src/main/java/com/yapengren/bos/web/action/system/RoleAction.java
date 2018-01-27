package com.yapengren.bos.web.action.system;

import com.yapengren.bos.domain.system.Role;
import com.yapengren.bos.service.system.RoleService;
import com.yapengren.bos.utils.action.BaseAction;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Results({@Result(name = "toList", type = "redirect", location = "/pages/system/role.html")})
public class RoleAction extends BaseAction<Role> {

    @Autowired
    private RoleService rs;

    /**
     * 查询角色列表
     * @return
     */
    @Action("RoleAction_list")
    public String list() {
        //查询角色列表
        List<Role> list = rs.findAll();
        //转换json，发送到浏览器
        list2Client(list, "users", "permissions", "menus");

        return null;
    }

    //接收权限id
    private List<Integer> permissionIds;
    //接收菜单id
    private String menuIds;

    /**
     * 保存角色
     * @return
     */
    @Action("RoleAction_add")
    public String add() {
        //切割菜单id => 菜单id 的String 数组
        String[] menuIdsStringArray = menuIds.split(",");

        //将菜单id 的String 数组 => 菜单id 的Integer 数组
        List<Integer> menuIdIntList = new ArrayList<>();

        for (int i = 0; i < menuIdsStringArray.length; i++) {
            menuIdIntList.add(Integer.parseInt(menuIdsStringArray[i]));
        }

        //调用service 保存角色
        rs.save(model, permissionIds, menuIdIntList);

        return "toList";
    }

    public List<Integer> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<Integer> permissionIds) {
        this.permissionIds = permissionIds;
    }

    public String getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds;
    }
}

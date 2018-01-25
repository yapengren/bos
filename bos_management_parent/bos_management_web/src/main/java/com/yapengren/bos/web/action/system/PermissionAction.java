package com.yapengren.bos.web.action.system;

import com.yapengren.bos.domain.system.Permission;
import com.yapengren.bos.service.system.PermissionService;
import com.yapengren.bos.utils.action.BaseAction;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Results({@Result(name = "toList", type = "redirect", location = "/pages/system/permission.html")})
public class PermissionAction extends BaseAction<Permission> {

    @Autowired
    private PermissionService ps;

    /**
     * 查询权限列表
     * @return
     */
    @Action("PermissionAction_list")
    public String list() {
        //查询权限列表
        List<Permission> list = ps.findAll();
        //转换json，发送到浏览器
        list2Client(list, "roles");

        return null;
    }

    /**
     * 保存权限
     * @return
     */
    @Action("PermissionAction_add")
    public String add() {
        ps.save(model);
        return "toList";
    }
}

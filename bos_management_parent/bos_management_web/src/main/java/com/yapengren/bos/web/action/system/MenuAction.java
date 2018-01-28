package com.yapengren.bos.web.action.system;

import com.yapengren.bos.domain.system.Menu;
import com.yapengren.bos.domain.system.User;
import com.yapengren.bos.service.system.MenuService;
import com.yapengren.bos.utils.action.BaseAction;
import org.apache.shiro.SecurityUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Results({@Result(name = "toList", type = "redirect", location = "/pages/system/menu.html")})
public class MenuAction extends BaseAction<Menu> {

    @Autowired
    private MenuService ms;

    /**
     * 获得menu 列表数据
     * @return
     */
    @Action("MenuAction_list")
    public String list() {
        //调用Service 查询menu 数据
        List<Menu> list = ms.findAll();

        //转换json 发送到浏览器
        list2Client(list, "roles", "parentMenu", "childMenus");

        return null;
    }

    /**
     * 保存菜单
     * @return
     */
    @Action("MenuAction_add")
    public String add() {
        //为了避免没有父级菜单时，parentMenu 属性有值存在
        if (model.getParentMenu().getId() == null) {
            model.setParentMenu(null);
        }
        //调用service 保存menu 数据
        ms.save(model);
        //重定向到菜单列表
        return "toList";
    }

    /**
     * 查询当前登录用户的菜单json
     * @return
     */
    @Action("MenuAction_findByLoginUser")
    public String findByLoginUser() {
        //获得登录用户
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        //调用service 根据登录用户查询
        List<Menu> list = ms.findByLoginUser(user);

        //转换json，发送到浏览器
        list2Client(list, "roles", "childrenMenus", "parentMenu", "children");

        return null;
    }
}

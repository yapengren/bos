package com.yapengren.bos.web.action.system;

import com.yapengren.bos.domain.system.User;
import com.yapengren.bos.service.system.UserService;
import com.yapengren.bos.utils.action.BaseAction;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Results({@Result(name = "toIndex", type = "redirect", location = "/index.html"),
          @Result(name = "toLogin", type = "redirect", location = "/login.html"),
          @Result(name = "toList", type = "redirect", location = "pages/system/userlist.html")
})
public class UserAction extends BaseAction<User> {

    @Autowired
    private UserService us;

    //获得角色id
    private List<Integer> roleIds;

    /**
     * 登录
     * @return
     */
    @Action("UserAction_login")
    public String login() {
        //获得Subject
        Subject subject = SecurityUtils.getSubject();

        //封装用户名密码到token 中
        UsernamePasswordToken token = new UsernamePasswordToken(model.getUsername(), model.getPassword());

        //调用Subject 对象的login方法
        subject.login(token);

        //重定向到index.html
        return "toIndex";
    }

    /**
     * 查询用户列表
     * @return
     */
    @Action("UserAction_list")
    public String list() {
        List<User> list = us.findAll();

        list2Client(list, "roles");

        return null;
    }

    /**
     * 保存用户
     * @return
     */
    @Action("UserAction_add")
    public String add() {
        us.save(model, roleIds);
        return "toList";
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }
}

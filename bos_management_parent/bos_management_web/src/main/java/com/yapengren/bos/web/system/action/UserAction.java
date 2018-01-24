package com.yapengren.bos.web.system.action;

import com.yapengren.bos.domain.system.User;
import com.yapengren.bos.utils.action.BaseAction;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({@Result(name = "toIndex", type = "redirect", location = "/index.html")})
public class UserAction extends BaseAction<User> {

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
}

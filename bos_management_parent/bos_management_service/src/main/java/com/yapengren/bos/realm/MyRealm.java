package com.yapengren.bos.realm;

import com.yapengren.bos.dao.system.PermissionDao;
import com.yapengren.bos.dao.system.UserDao;
import com.yapengren.bos.domain.system.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("myRealm")
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserDao ud;

    @Autowired
    private PermissionDao pd;

    /**
     * 授权
     * @param paramPrincipalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection paramPrincipalCollection) {

        //获得user 对象
        User user = (User) paramPrincipalCollection.getPrimaryPrincipal();

        //调用dao 查询user的权限
        List<String> permissionList = pd.findPermissionByLoginUser(user.getId());

        //创建授权信息对象，将user 的权限添加到授权信息对象中
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionList);
        //info.addRole("admin");    //指定当前认证对象的角色为 "admin"（用不着）
        // info.addStringPermissions(list);    //添加多个权限

        return info;
    }

    /**
     * 认证
     * @param paramAuthenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken paramAuthenticationToken) throws AuthenticationException {

        //取出用户名密码
        UsernamePasswordToken token = (UsernamePasswordToken) paramAuthenticationToken;
        String username = token.getUsername();

        //根据用户名从数据库中查询User 对象
        User user = ud.findByUsername(username);

        if (user != null) {
            //查询到了 => 返回认证信息对象
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
            return info;
        } else {
            //未查询到 => 返回null
            return null;
        }

    }
}

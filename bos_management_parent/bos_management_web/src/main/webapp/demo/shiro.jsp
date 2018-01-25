<%--
  Created by IntelliJ IDEA.
  User: renyapeng
  Date: 2018/1/25 0025
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<shiro:guest>
    只有未登录用户才能看到<br>
</shiro:guest>
<shiro:user>
    只有登录用户才能看到<br>
</shiro:user>
<shiro:hasPermission name="area">
    登录并拥有area 权限才能看到
</shiro:hasPermission>
<shiro:hasRole name="admin">
    登录并拥有admin 角色才能看到
</shiro:hasRole>
</body>
</html>

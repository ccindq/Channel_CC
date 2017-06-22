<%--
  Created by IntelliJ IDEA.
  User: CC
  Date: 2017/6/13
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1>
<div>
    <form action="user/login" method="post">
        <label>用户名</label>
        <input type="text" name="userName" placeholder="请输入用户名"/>
        <br><br>
        <label>密码</label>
        <input type="password" name="userPwd" placeholder="请输入密码"/>
        <br><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>

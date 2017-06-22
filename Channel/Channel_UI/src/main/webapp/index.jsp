<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <%@ include file="basicpages/base.jsp" %>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="navbar-header">
        <a href="#" class="navbar-brand">导航栏</a>
    </div>
    <ul>
        <nav class="nav navbar-nav">
            <li><a href="/index.jsp">首页</a></li>
            <li><a href="toUserLoginUI">登录</a></li>
            <li><a href="toUserRegistUI">注册</a></li>
            <li><a href="user/logout">注销</a></li>
            <li><a href="">找回密码</a></li>
            <li><a href="">找回帐号</a></li>
            <c:if test="${!empty sessionScope.loginUser}">
                <li><a href="">${sessionScope.loginUser.userName}</a> </li>
            </c:if>

        </nav>
    </ul>
</nav>
<h1>图书订阅服务,石英计时,检索目标图书目录,发送邮件</h1>
<h1><a href="biz/initSecondView">测试redis抢购服务</a></h1>
<h1>石英计时,测试天气服务</h1>
<h1>调查服务</h1>
<h1>购物车</h1>
</body>
</html>
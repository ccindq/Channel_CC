<%--
  Created by IntelliJ IDEA.
  User: CC
  Date: 2017/6/12
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 容器 -->
<div class="container">
    <div class="jumbotron" style="text-align: center;">
        <h4>[抱歉，您刚才的操作有误！]</h4>
        <c:if test="${!empty exception }">
            <h4>${requestScope.exception.message }</h4>
        </c:if>
        <button class="btn btn-danger">返回继续操作</button>
    </div>
</div>
</body>
</html>

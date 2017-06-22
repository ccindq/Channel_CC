<%--
  Created by IntelliJ IDEA.
  User: CC
  Date: 2017/6/13
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<h1>秒杀页面</h1>
<div>
    <form action="biz/secondkill" method="post">
        <label>剩余数量</label>
        <c:if test="${!empty requestScope.productAmount}">
         <input type="text" value="${requestScope.productAmount}">
        </c:if>
        <input type="text" value="写的不对,或没查到">
        <label>剩余时间</label>
        <input type="submit" value="秒杀">
    </form>
</div>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/14
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty LOGIN}">
    欢迎${LOGIN.ename}
    <a href="${pageContext.request.contextPath}/logout">退出</a>
</c:if>
<c:if test="${empty LOGIN}">
    <a href="${pageContext.request.contextPath}/login">登录</a>
</c:if><br><br>
<a href="${pageContext.request.contextPath}/city/list">城市管理</a><br><br>
<a href="${pageContext.request.contextPath}/emp/list">员工管理旧版</a><br><br>
<a href="${pageContext.request.contextPath}/empy/list">员工管理！</a><br><br>
<a href="${pageContext.request.contextPath}/depty/list">部门管理！</a><br><br>
</body>
</html>

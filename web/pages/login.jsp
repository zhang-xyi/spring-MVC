<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/14
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div style="color: red">${empy.msg}</div>
<form action="${pageContext.request.contextPath}/doLogin" method="post">
    用户名：<input name="ename"><br>
    密&nbsp;码：<input type="password" name="empno"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/8
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工添加</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/emp/save" method="post">
<table width="1000" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">
    <tr>
        <td>员工编号：</td>
        <td><input name="empno"></td>
    </tr>
    <tr>
        <td>员工姓名：</td>
        <td><input  name="ename"></td>
    </tr>
    <tr>
        <td>性别：</td>
        <td><input type="radio" name="gender" value="1">男&nbsp;
            <input type="radio" name="gender" value="0">女</td>
    </tr>
    <tr>
        <td>职位：</td>
        <td><input name="job"></td>
    </tr>
    <tr>
        <td>领导：</td>
        <td><input name="mgr"></td>
    </tr>
    <tr>
        <td>入职日期：</td>
        <td><input name="hiredate"></td>
    </tr>
    <tr>
        <td>薪资：</td>
        <td><input name="sal"></td>
    </tr>
    <tr>
        <td>补贴：</td>
        <td><input name="comm"></td>
    </tr>
    <tr>
        <td>部门编号：</td>
        <td><input name="deptno"></td>
    </tr>
</table>
    <input type="submit" value="提交">
</form>
</body>
</html>

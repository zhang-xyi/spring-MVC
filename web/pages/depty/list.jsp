<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/8
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>部门列表</title>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/DeptyCss.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/DeptyJS.js"></script>
    <%--<script>
        $(function () {
            $(".delll").click(function () {
                return confirm("确认要删除["+this.name+"]号部门吗")
            })
        })
    </script>--%>
</head>
<body>

<div>
    <%--用这个必须传modelAttribute--%>
<form:form action="${pageContext.request.contextPath}/depty/list" modelAttribute="depty">
    部门编号：<form:input path="deptno" class="in"/>
    部门名称：<form:input path="dname" class="in"/>
    部门位置：<form:input path="loc"  class="in"/>
    <input type="submit" value="搜索">
    <input type="button" value="重置" id="reset" >
</form:form>
</div>

<div>
    <a href="${pageContext.request.contextPath}/depty/edit">部门添加</a><br><br>
</div>
<form action="${pageContext.request.contextPath}/depty/deleteBatch" id="delForm"  method="get">
<table width="1000" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">
    <tr>
        <th><input type="checkbox" id="checkAll" />
        <input type="button" id="deleteBatch" value="批量删除"></th>
        <th>部门编号</th>
        <th>部门名称</th>
        <th>部门位置</th>
        <th>操作</th>
    </tr>
    <c:forEach var="depty" items="${deptyList}">
        <tr>
            <td><input type="checkbox" name="deptnos" value="${depty.deptno}"></td>
            <td>${depty.deptno}</td>
            <td>${depty.dname}</td>
            <td>${depty.loc}</td>
            <td>
                <a href="${pageContext.request.contextPath}/depty/edit?deptno=${depty.deptno}">修改</a>&nbsp;&nbsp;
                <%--<a onclick="javascript:return del(this)" name="${depty.dname}"
                   href="${pageContext.request.contextPath}/depty/delete?deptno=${depty.deptno}">删除</a>--%>
               <%-- <a onclick="javascript:return del(this)" name="${depty.dname}"
                   href="${pageContext.request.contextPath}/depty/delete?deptno=${depty.deptno}">删除</a>--%>
                <a class="dell" name="${depty.dname}"
                   href="${pageContext.request.contextPath}/depty/delete?deptno=${depty.deptno}">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/8
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<script type="text/javascript">
    function del(thisNode) {
        var msg="确认删除"+thisNode.getAttribute("name")+"吗？"
        if (confirm(msg)){
            return true
        } else {
            return false
        }
    }
</script>
<div>
    <a href="${pageContext.request.contextPath}/emp/add">员工添加</a>
</div>
<table width="1000" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">
    <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>性别</th>
        <th>职位</th>
        <th>领导</th>
        <th>入职日期</th>
        <th>薪资</th>
        <th>补贴</th>
        <th>部门编号</th>
        <th>操作</th>
    </tr>
    <c:forEach var="emp" items="${empList}">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.gender==1?"男":"女"}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <%--<fmt:formatDate value="${emp.hiredate}" var="validDate" pattern="yyyy-MM-dd"></fmt:formatDate>
            <td>${validDate}</td>--%>
            <td>${emp.hiredate}</td>
            <td>${emp.sal}</td>
            <td>${emp.comm==null?'':emp.comm}</td>
            <td>${emp.deptno}</td>
            <td>
                <a href="${pageContext.request.contextPath}/emp/edit?empno=${emp.empno}">修改</a>&nbsp;&nbsp;
                <a onclick="javascript:return del(this)" id="${emp.empno}" name="${emp.ename}"
                   href="${pageContext.request.contextPath}/emp/delete?empno=${emp.empno}">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>

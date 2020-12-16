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
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<html>
<head>
    <title>员工列表</title>
    <script language="javascript" type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script language="javascript" type="text/javascript"
            src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/EmpyCss.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/EmpyJS.js"></script>
</head>
<body>

<div>
    <%--用这个必须传modelAttribute--%>
    <form:form action="${pageContext.request.contextPath}/empy/list" modelAttribute="empy">
        教师姓名：<form:input path="ename" class="in"/>&nbsp;
        教师性别：<form:radiobutton path="gender" value="" label="不限" checked="checked"/>
        <form:radiobutton path="gender" value="男" label="男"/>
        <form:radiobutton path="gender" value="女" label="女"/><br>
        入职日期：<form:input path="startdate" class="Wdate" onClick="WdatePicker()" readonly="true"/>
        至
        <form:input path="enddate" class="Wdate" onClick="WdatePicker()" readonly="true"/><br>
        员工薪资：<form:input path="startsal" class="in"/>
        至
        <form:input path="endsal" class="in"/><br>
        <input type="submit" value="搜索">
        <input type="button" value="重置" id="reset">
    </form:form>
</div>

<div>
    <a href="${pageContext.request.contextPath}/empy/edit">员工添加</a><br><br>
</div>
<form action="${pageContext.request.contextPath}/empy/deleteBatch" id="delForm" method="get">
    <table width="1000" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">
        <tr>
            <th><input type="checkbox" id="checkAll"/>
                <input type="button" id="deleteBatch" value="批量删除"></th>
            <th>员工编号</th>
            <th>员工姓名</th>
            <th>性别</th>
            <th>职位</th>
            <th>领导</th>
            <th>入职日期</th>
            <th>薪资</th>
            <th>补贴</th>
            <th>部门</th>
            <th>操作</th>
        </tr>
        <c:forEach var="empy" items="${empyList}">
            <tr>
                <td><input type="checkbox" name="empids" value="${empy.empid}"></td>
                <td>${empy.empno}</td>
                <td>${empy.ename}</td>
                <td>${empy.gender}</td>
                <td>${empy.job}</td>
                <td>${empy.mgr}</td>
                    <%-- <fmt:formatDate value="${emp.hiredate}" var="validDate" pattern="yyyy-MM-dd"></fmt:formatDate>
                     <td>${validDate}</td>--%>
                <td>${empy.hiredate}</td>
                <td>${empy.sal}</td>
                <td>${empy.comm}</td>
                <td>${empy.depty.dname}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/empy/edit?empid=${empy.empid}">修改</a>&nbsp;&nbsp;
                    <a onclick="javascript:return del(this)" id="${empy.empid}" name="${empy.ename}"
                       href="${pageContext.request.contextPath}/empy/delete?empid=${empy.empid}">删除</a>
                </td>
            </tr>
        </c:forEach>

    </table>
    <table width="1000px" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">
        <tr>
            <td>一共${page.pages}页</td>
            <td>一共${page.totalCount}条记录</td>
            <td><a  href="${page.url}&pageNo=1">首页</a></td>
            <td><a href="${page.url}&pageNo=${page.pageNo-1}">上一页</a></td>
            <td>当前第${page.pageNo}页</td>
            <td><a href="${page.url}&pageNo=${page.pageNo+1}">下一页</a></td>
            <td><a href="${page.url}&pageNo=${page.pages}">尾页</a></td>
            <td>去第<input>页</td>
            <td><a>去第
                <select>

                </select>
                页</a></td>
        </tr>
    </table>
</form>
</body>
</html>

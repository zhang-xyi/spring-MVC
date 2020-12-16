<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/8
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>员工信息更新</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/DeptyCss.css">
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>
</head>
<body>
<f:form action="${pageContext.request.contextPath}/depty/update" modelAttribute="depty">
    <table width="500" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">
        <tr>
            <td>部门编号：</td>
            <td><f:input path="deptno"/></td>
        </tr>
        <tr>
            <td>部门名称：</td>
            <td><f:input path="dname"/></td>
        </tr>
        <tr>
            <td>部门位置：</td>
            <td><f:input path="loc"/></td>
        </tr>
    </table>
    <div> <br><input type="submit" id="add" value="提交"></div>

</f:form>
</body>
</html>
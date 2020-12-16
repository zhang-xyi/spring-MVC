<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/8
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工信息更新</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/EmpyCss.css">
    <script language="javascript" type="text/javascript"
            src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>
</head>
<body>
<f:form action="${pageContext.request.contextPath}/empy/update" modelAttribute="empy" >
    <f:hidden path="empid"/></td>
    <table width="500" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">
        <tr>
            <td>员工编号：</td>
            <td><f:input path="empno"/></td>
        </tr>
        <tr>
            <td>员工姓名：</td>
            <td><f:input path="ename"/></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><f:radiobutton path="gender" value="男" label="男"/>
                <f:radiobutton path="gender" value="女" label="女"/>
            </td>
        </tr>
        <tr>
            <td>职位：</td>
            <td><f:input path="job"/></td>
        </tr>
        <tr>
            <td>领导：</td>
            <td><f:input path="mgr"/></td>
        </tr>
        <tr>
            <td>入职日期：</td>
            <td><f:input path="hiredate" class="Wdate" onClick="WdatePicker()" readonly="true"/></td>
        </tr>
        <tr>
            <td>薪资：</td>
            <td><f:input path="sal"/></td>
        </tr>
        <tr>
            <td>补贴：</td>
            <td><f:input path="comm"/></td>
        </tr>
        <tr>
            <td>部门：</td>
            <td>
                <f:select path="deptno">
                    <f:option value="" label="请选择部门"></f:option>
                    <c:forEach var="depty" items="${deptyList}">
                        <f:option value="${depty.deptno}" label="${depty.dname}"></f:option>
                    </c:forEach>
                </f:select>
               <%-- <select>
                    <option value="">部门名称</option>
                    <c:forEach var="depty" items="${deptyList}">
                        <option value="${depty.deptno}">${depty.dname}</option>
                    </c:forEach>
                </select>--%>
            </td>
        </tr>
    </table>
    <div><br><input type="submit" id="add" value="提交"></div>

</f:form>
</body>
</html>
<%--<form action="${pageContext.request.contextPath}/emp/update" method="post">
   <%--<table width="1000" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">

           <input type="hidden" name="empno" value="${empy.empid}">

       <tr>
           <td>员工编号：</td>
           <td><input  name="empno" value="${empy.empno}"></td>
       </tr>
       <tr>
           <td>员工姓名：</td>
           <td><input  name="ename" value="${empy.ename}"></td>
       </tr>
       <tr>
           <td>性别：</td>
           <td><input type="radio" name="gender" value="男" ${empy.gender eq "男" ? "checked='checked'":""}>男&nbsp;
               <input type="radio" name="gender" value="女" ${empy.gender eq "女" ? "checked='checked'":""}>女</td>
       </tr>
       <tr>
           <td>职位：</td>
           <td><input name="job" value="${empy.job}" ></td>
       </tr>
       <tr>
           <td>领导：</td>
           <td><input name="mgr" value="${empy.mgr}" ></td>
       </tr>
       <tr>
           <td>入职日期：</td>
           <td><input name="hiredate" value="${empy.hiredate}" ></td>
       </tr>
       <tr>
           <td>薪资：</td>
           <td><input name="sal" value="${empy.sal}" ></td>
       </tr>
       <tr>
           <td>补贴：</td>
           <td><input name="comm" value="${empy.comm}" ></td>
       </tr>
       <tr>
           <td>部门编号：</td>
           <td><input name="deptno" value="${empy.deptno}" ></td>
       </tr>
   </table>
   <input type="submit" value="提交">&ndash;%&gt;--%>
<%--</form>--%>
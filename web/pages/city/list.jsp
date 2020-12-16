<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/8
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>城市列表</title>
</head>
<body>

<table width="1000" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;text-align: center">
    <tr>
        <th>cid</th>
        <th>cname</th>
        <th>pid</th>
    </tr>
    <c:forEach var="city" items="${cityList}">
        <tr>
            <td>${city.cid}</td>
            <td>${city.cname}</td>
            <td>${city.pid}</td>
        </tr>
    </c:forEach>

</table>


</body>
</html>

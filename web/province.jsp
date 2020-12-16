<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangyi
  Date: 2020/12/16
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.5.1.js"></script>
    <script>
        $.ajax({
            url: '/SSM_springMVC/objectTest03',
            type: 'get',
            dataType: 'json',
            success: function (data) {
                for (var i = 0; i < data.length; i++) {
                    $('#province').append("<option>" + data[i].pid + "</option>")
                }

            }
        })
    </script>
</head>
<body>
城市：<select id="province">
    <%-- <C:forEach items="${cities}" var="city">
         <option >${city.cname}</option>
     </C:forEach>--%>

</select>
</body>
</html>

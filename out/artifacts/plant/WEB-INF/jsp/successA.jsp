<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="row clearfix">
    <div class="col-md-6 column">
        <h3>${success} <a href="${pageContext.request.contextPath}/users/success" >返回</a></h3>
        <%response.setHeader("Refresh","10;url = /users/success");%>
    </div>
</div>
</body>
</html>
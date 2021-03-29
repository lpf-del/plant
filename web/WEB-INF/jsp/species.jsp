<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="col-md-1 column">
    <a class="btn btn-primary" href="${pageContext.request.contextPath}/species/addPlant">添加特性</a>
</div>
<div class="row clearfix">
    <div class="col-md-6 column">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>特征编号</th>
                <th>特征内容</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="species" items="${requestScope.get('specieslist')}">
                <tr>
                    <td>${species.sid}</td>
                    <td>${species.sname}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/users/toUpdatespecies?id=${species.sid}">更改</a>
                        <a href="${pageContext.request.contextPath}/users/delate2?id=${species.sid}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>

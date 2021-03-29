<%--
  Created by IntelliJ IDEA.
  User: lipf
  Date: 2021/3/14
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="col-md-1 column">
    <a class="btn btn-primary" href="${pageContext.request.contextPath}/relationship/addPlantrule">添加规则</a>
</div>
<div class="row clearfix">
    <div class="col-md-6 column">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>规则编号</th>
                <th>规则内容</th>
                <th>结果</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="relationship" items="${requestScope.get('relationshiplist')}">
                <tr>
                    <td>${relationship.rid}</td>
                    <td>${relationship.rult}</td>
                    <td>${relationship.getResult()}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/relationship/toUpdatePlant?id=${relationship.rid}">更改</a>
                        <a href="${pageContext.request.contextPath}/relationship/delate/${relationship.rid}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>

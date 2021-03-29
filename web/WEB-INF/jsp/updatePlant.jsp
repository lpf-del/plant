<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>植物特征</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-6 column">
            <div class="page-header">
                <h1>
                    <small>植物特征</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/users/updateSpecies" method="post">
        <input type="hidden" name="sid" value="${species.sid}">
        <div>
            <label>特征名称</label>
            <input type="text" name="sname" class="form-control" value="${species.sname}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>
</body>
</html>
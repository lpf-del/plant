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
                    <small>植物规则</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/users/updateRelationship" method="post">
        <div>
            <label>规则编号</label>
            <input type="text" name="rid" class="form-control" value="${relationship.rid}" required>
        </div>
        <div>
            <label>规则内容</label>
            <input type="text" name="rult" class="form-control" value="${relationship.rult}" required>
        </div>
        <div>
            <label>结果</label>
            <input type="text" name="Result" class="form-control" value="${relationship.getResult()}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>
</body>
</html>
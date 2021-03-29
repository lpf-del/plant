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
        <div class="col-md-3 column">
            <div class="page-header">
                <h1>
                    <small>植物规则</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/relationship/addPlantrule1" method="post">
        <div>
            <label>规则详情</label>
            <input type="text" name="rult"  required><span style="color: red;font-weight: bold">${success}</span>
        </div>
        <div>
            <label>匹配结果</label>
            <input type="text" name="Result"  required><span style="color: red;font-weight: bold">${success}</span>
        </div>
        <div class="form-group">
            <input type="submit" value="添加">
        </div>
    </form>
</div>
</body>
</html>
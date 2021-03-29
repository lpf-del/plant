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
    <div class="row clearfix">
            <table class="table table-hover table-striped">
                <tbody>
                <c:forEach var="plant" items="${requestScope.get('list')}">
                        ${plant.getSid()}<%out.print(".");%>${plant.getSname()}<br>
                </c:forEach>
                </tbody>
            </table>
    </div>

        <div class="col-md-4 column">
            <form  class="form-inline" action="${pageContext.request.contextPath}/relationship/queryrultzheng" method="post" style="float:right">
                <input type="text" name="queryrultName" class="form-control" placeholder="请输入要推理的特征" required>
                <input type="submit" value="正向推理" class="btn btn-primary">
            </form>
            <form  class="form-inline" action="${pageContext.request.contextPath}/relationship/queryrultni" method="post" style="float:right">
                <input type="text" name="queryrultName1" class="form-control" placeholder="请输入推理特征" required>
                <input type="text" name="queryrultName2" class="form-control" placeholder="请输入假设结果" required>
                <input type="submit" value="逆向推理" class="btn btn-primary">
                <br>
                <span style="color: red;font-weight: bold">${success}</span>
                <br>
                <span style="color: red;font-weight: bold">请输入特征（特征之间用“&”分隔）</span>
            </form>
        </div>

    </div>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-6 column">
            <div class="page-header">
                <h1>
                    <small>${tui}</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <table class="table table-hover table-striped">
            <tbody>
            &nbsp
            <c:forEach var="relationship" items="${requestScope.get('relationshiplist')}">
                ${relationship.rult}<%out.print("->");%>${relationship.getResult()}<br>&nbsp
            </c:forEach>
            &nbsp&nbsp${ni}
            </tbody>
        </table>
    </div>
</div>
</div>
</body>
</html>
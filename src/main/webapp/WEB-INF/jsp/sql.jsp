
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改,删除,添加</title>
    <style>
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<h3>
        <a  href="${pageContext.request.contextPath}/users/species">特征修改,删除,添加</a>
</h3>
<br>
<h3>
        <a href="${pageContext.request.contextPath}/users/relationship">规则修改,删除,添加</a>
</h3>
</body>
</html>

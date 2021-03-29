<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Plants首页</title>
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
</head>
<body>
<h3>
  <a href="${pageContext.request.contextPath}/species/allSpecies">植物生成式</a>
</h3>
<h3>
  <a href="${pageContext.request.contextPath}/users/sql">特征和规则的增删改</a>
</h3>
</body>
</html>
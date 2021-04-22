<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/18
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<h2>code:${code}</h2>
<h2>${msg}${id}</h2>

<form action="index" method="get">
    <input type="submit" value="index">
</form>
<form action="editLesson" method="get">
    <input type="hidden" value="${id}" name="id">
    <input type="submit" value="add place and time for this lesson">
</form>
</body>
</html>

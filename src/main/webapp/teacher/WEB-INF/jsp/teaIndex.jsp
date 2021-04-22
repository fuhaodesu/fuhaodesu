<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/18
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>index for teacher</h1>
<form action="/teacher/sin" method="get">
    <input type="submit" value="sign in">
</form>
<form action="/teacher/sup" method="get">
    <input type="submit" value="sign up">
</form>

<form action="/teacher/createLesson" method="get">
    <input type="submit" value="create lesson">
</form>

<form action="/teacher/list" method="get">
    <input type="submit" value="list students">
</form>



</body>
</html>

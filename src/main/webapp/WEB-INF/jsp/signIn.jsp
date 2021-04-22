<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
</head>
<body>
<h1>${hello}</h1>
<ul>
    <form action="saveUser" method="post">
        username: <input type="text" name="username" ><br>
        password: <input type="password" name="password" ><br>
        <input type="submit" value="Submit">
    </form>
</ul>
</body>
</html>
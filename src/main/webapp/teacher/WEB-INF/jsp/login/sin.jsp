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
<h2>sign in as teacher</h2>
<ul>
    <form action="sin" method="post">
        username: <input type="text" name="user_name" ><br>
        password: <input type="password" name="user_pwd" ><br>
        <input type="submit" value="Submit">
    </form>
</ul>
</body>
</html>
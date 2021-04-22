<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <title>登录</title>
    <style>

        body{
            background-color: #CCFFFF;
        }
        .box1{
            transform: translateY(30%);

            background-color: #99CCCC;
            border-radius: 20px;
            width: 300px;

            padding: 80px 20px;
            margin:0px auto;
        }
        .text1{
            color: #336699;
        }
        .input1{
            border: 1px solid #ccc;
            font-size: 16px;
            margin-top: 10px;
            padding: 10px 25px;
            border-radius: 10px;
        }
        .input2{
            margin-top: 10px;
            background-color: #99CCCC;
            border: 0px;
            border-bottom:1px solid #000000;
            padding: 1px;
        }
    </style>

</head>
<body>


    <div class="box1" align="center">
        <h1 class="text1">学生登录</h1>


        <form action="sin" method="post">

            <input type="text" name="user_name" placeholder="用户名" class="input1">
            <input type="password" name="user_pwd" placeholder="密码" class="input1">
            <input type="submit" value="登录" class="input1">
        </form>
        <form action="sup" method="get" >
            <input type="submit" value="注册" class="input2">
        </form>

    </div>








</body>
</html>
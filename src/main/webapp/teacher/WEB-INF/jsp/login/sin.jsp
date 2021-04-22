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
            width: fit-content;

            padding: 80px 20px;
            margin:0px auto;
        }
        .text1{
            color: #336699;
        }
        input{
            border: 1px solid #ccc;
            font-size: 16px;
            margin-top: 10px;
            padding: 10px 25px;
            border-radius: 10px;
        }
        input:focus{
            　　　　border-color: #ff962d;
            　　　　outline: 0;
            　　　　-webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(255, 150, 43, 0.6);
            　　　　box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(255,150,43,.6);
        }

    </style>

</head>
<body>


    <div class="box1" align="center">
        <h1 class="text1">教师登录</h1>


        <form action="sin" method="post">

            <div class="box2"><input type="text" name="user_name" placeholder="用户名" ></div>
            <div class="box2"><input type="text" name="password" placeholder="密码" ></div>
            <input type="submit" value="Submit">
        </form>

    </div>








</body>
</html>
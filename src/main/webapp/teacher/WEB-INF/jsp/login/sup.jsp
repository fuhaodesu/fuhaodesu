<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/17
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sign up as teacher</title>
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
        input{
            border: 1px solid #ccc;
            font-size: 16px;
            margin-top: 10px;
            padding: 10px 25px;
            border-radius: 10px;
        }
        .text2{

            color: #979797;
            margin: 5px 5px;
            font-size: 8px;
        }
    </style>
</head>
<div class="box1" align="center">
    <h1 class="text1">教师注册</h1>

    <form action="sup" method="post">
        <input type="text" name="user_name" placeholder="用户名">
        <div class="text2">*3-12 characters</div>
        <input type="password" name="user_pwd" placeholder="密码">
        <div class="text2">*6-30 characters(include letters and numbers)</div>
        <input type="password" name="user_pwd2" placeholder="再次输入密码"><br>
        <input type="submit" value="Submit">
    </form>
</div>



<body>

</body>
</html>

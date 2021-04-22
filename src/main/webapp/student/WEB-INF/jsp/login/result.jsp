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

    </style>
</head>
<body>
<div class="box1" align="center">
    <h1 class="text1">错误代码：${code}</h1>
    <h1 class="text1">${msg}</h1>
    <form action="sin" method="get">
        <input type="submit" value="back">
    </form>
</div>

</body>
</html>

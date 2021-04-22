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

    <style>
        header {
            background-color: #6699CC;
            color:white;
            text-align:center;
            padding:5px;
        }
        nav {
            line-height:30px;
            background-color: #CCFFFF;
            height:700px;
            width:200px;
            float:left;

        }
        section {
            width:350px;
            float:left;
            padding:10px;
        }
        footer {
            background-color:#6699CC;
            color:white;
            clear:both;
            text-align:center;
            padding:5px;
        }
        .button {
            /*margin-top: 10px;*/
            width: 100%;
            background-color: #66CCFF; /* Green */
            border: none;
            color: #ffffff;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            float: left;
        }
        .button:hover {
            background-color:#6699CC; /* Green */
        }
        .button_login{
            background-color:#6699CC;
        }
    </style>
</head>
<body>
<header>
    <h1>index for student</h1>
</header>
<nav>
    <form action="/student/sin" method="get">
        <input type="submit" value="sign in" class="button">
    </form>
    <form action="/student/sup" method="get">
        <input type="submit" value="sign up" class="button">
    </form>

</nav>
<footer>
    CopyRight 2021 JiRan
</footer>



</body>
</html>

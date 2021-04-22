<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/18
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create lesson</title>
    <link rel="stylesheet" type="text/css" href="index.css"/>
    <style>
        section {
            width:500px;
            float:left;
            padding:10px;
            margin:0px auto;
            align-content: center;
        }
        header
        {
            background-color:#6699CC;
            color:white;
            text-align:center;
            padding:5px;
        }
        .button1 {
            margin-left: 60px;
            margin-top: 10px;
            width: 100px;
            background-color: #66CCFF; /* Green */
            border: none;
            color: #ffffff;
            padding: 15px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            float: left;
            border-radius: 5px;
        }
        .button1:hover {
            background-color:#6699CC; /* Green */
        }        .button {
                     /*margin-top: 10px;*/
                     width: 100%;
                     background-color: #66CCFF;
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
            background-color:#6699CC;
        }
        .buttonHover{
            background-color:#6699CC;
            /*margin-top: 10px;*/
            width: 100%;
            border: none;
            color: #ffffff;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            float: left;
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
    </style>

</head>
<body>
<header>
    <h1>list lessons</h1>
</header>
<nav>
    <form action="/teacher/sin" method="get">
        <input type="submit" value="sign in" class="button"/>
    </form>
    <form action="/teacher/sup" method="get">
        <input type="submit" value="sign up" class="button"/>
    </form>

    <form action="/teacher/createLesson" method="get">
        <input type="submit" value="create lesson" class="button"/>
    </form>

    <form action="/teacher/listLesson" method="get">
        <input type="submit" value="list lessons" class="buttonHover"/>
    </form>
    <form action="/teacher/editLesson" method="get">
        <input type="submit" value="edit lesson" class="button"/>
    </form>
    <form action="/teacher/fileUpload" method="get">
        <input type="submit" value="file upload" class="button"/>
    </form>
</nav>
<section>
<%--Ajax --%>


</section>
<footer>
    CopyRight 2021 JiRan
</footer>


</body>
</html>

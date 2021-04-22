<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/20
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit a lesson</title>
    <link rel="stylesheet" type="text/css" href="index.css"/>
    <style>
        input::-webkit-outer-spin-button,
        input::-webkit-inner-spin-button {
            -webkit-appearance: none;
        }
        input[type="number"]{
            -moz-appearance: textfield;
        }
        /*去除箭头*/

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

            -moz-appearance:textfield;
            border: 1px solid #ccc;
            font-size: 8px;
            margin-top: 10px;
            padding: 10px 25px;
            border-radius: 2px;

            height: 30px;
            width: 100px;
            text-align: center;

        }
        section {
            width:500px;
            float:left;
            padding:10px;
            margin:0px auto;
            align-content: center;
        }

        .shortselect{
            background:#fafdfe;
            height:28px;
            width:180px;
            line-height:28px;
            border:1px solid #9bc0dd;
            -moz-border-radius:2px;
            -webkit-border-radius:2px;
            border-radius:2px;
        }
    </style>


</head>
<body>
<%--<form>--%>
<%--select a lesson:<select id='lesson'>--%>
<%--    <option value='shufen'>shufen</option>--%>
<%--    <option value="gaodai">gaodai</option>--%>
<%--    <option value="dajiji">dajiji</option>--%>
<%--</select>--%>
<header>
    <h1>edit ${lessonName}:${tea1},${tea2},${tea3},${tea4}</h1>
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

    <form action="/teacher/list" method="get">
        <input type="submit" value="list students" class="button"/>
    </form>
    <form action="/teacher/editLesson" method="get">
        <input type="submit" value="edit lesson" class="buttonHover"/>
    </form>
    <form action="/teacher/fileUpload" method="get">
        <input type="submit" value="file upload" class="button"/>
    </form>
</nav>
<section>
    <form action="editLesson" method="post">
        <p class="text1">添加上课地点：</p>
        <select name="building" class="shortselect">
        <option value='-1'>请选择上课地点</option>
        <option value="1j">教一</option>
        <option value="2j">教二</option>
        <option value="a">新主楼A座</option>
        <option value="m">主M</option>
    </select>
        <input type="number" name="room" placeholder="教室号如：204" class="input1" style="width: 200px"><br>
        <p class="text1">添加上课时间：</p>
        第<input type="number" name="startWeek" value="" class="input1">周到第<input type="number" name="endWeek" value="" class="input1">周<br>
        星期<input type="number" name="day" class="input1"><br>
        第<input type="number" name="startNum" class="input1">节到第<input type="number" name="startNum" class="input1">节<br>
        <%--<input type="hidden" value="${id}" name="id">--%>
        <input type="submit" value="Submit" class="button1">
    </form>

</section>
<footer>
    CopyRight 2021 JiRan
</footer>





</body>
</html>

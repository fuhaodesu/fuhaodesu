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
</head>
<body>
<%--<form>--%>
<%--select a lesson:<select id='lesson'>--%>
<%--    <option value='shufen'>shufen</option>--%>
<%--    <option value="gaodai">gaodai</option>--%>
<%--    <option value="dajiji">dajiji</option>--%>
<%--</select>--%>
<<<<<<< HEAD
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




=======
<h2>edit ${lessonName}:${tea1},${tea2},${tea3},${tea4}</h2>
<form action="editLesson" method="post">
add place:<select name='building'>
    <option value='-1'>请选择上课地点</option>
    <option value="1j">教一</option>
    <option value="2j">教二</option>
    <option value="a">新主楼A座</option>
    <option value="m">主M</option>
</select>
<input type="number" name="room"value="教室号如：204" ><br>
add time:第<input type="number" name="startWeek"value="" >周到第<input type="number" name="endWeek"value="" >周，
星期<input type="number" name="day">，第<input type="number" name="startNum">节到第<input type="number" name="startNum">节<br>
<%--<input type="hidden" value="${id}" name="id">--%>
    <input type="submit" value="Submit">
</form>
>>>>>>> a32a4849443e1882fdb2d174382afcf7d1c454a2

</body>
</html>

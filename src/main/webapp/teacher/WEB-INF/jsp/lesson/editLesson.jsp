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

</body>
</html>

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
</head>
<body>
<h2>create a lesson</h2>
<ul>
    <form action="createLesson" method="post">
        lesson name: <input type="text" name="lessonName" ><br>
        teachers' name:<input type="text" name="teaName1"><input type="text" name="teaName2"><input type="text" name="teaName3"><input type="text" name="teaName4"><br>
        <input type="submit" value="Submit">
    </form>
</ul>
</body>
</html>

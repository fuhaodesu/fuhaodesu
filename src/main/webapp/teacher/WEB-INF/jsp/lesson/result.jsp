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
</head>
<body>
<<<<<<< HEAD
<header>
    <h1>结果</h1>
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
        <input type="submit" value="edit lesson" class="button"/>
    </form>
    <form action="/teacher/fileUpload" method="get">
        <input type="submit" value="file upload" class="button"/>
    </form>
</nav>
<section>
    <h1>code:${code}</h1>
    <h2>${msg}${id}</h2>
    <form action="index" method="get">
        <input type="submit" value="index" class="button1">
    </form>
    <form action="editLesson" method="get">
        <input type="hidden" value="${id}" name="id" >
        <input type="submit" value="edit lesson" class="button1">
    </form>

</section>
<footer>
    CopyRight 2021 JiRan
</footer>




=======
<h2>code:${code}</h2>
<h2>${msg}${id}</h2>

<form action="index" method="get">
    <input type="submit" value="index">
</form>
<form action="editLesson" method="get">
    <input type="hidden" value="${id}" name="id">
    <input type="submit" value="add place and time for this lesson">
</form>
>>>>>>> a32a4849443e1882fdb2d174382afcf7d1c454a2
</body>
</html>

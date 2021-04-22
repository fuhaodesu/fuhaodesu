<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/2
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
    <script src="${pageContext.contextPath}/static/js/jquery-3.5.1.js"/>
</head>
<body>
<script type="text/javascript">
    function a1(){

        $.ajax({
            url:"${pageContext.request.contextPath}/ajax/a1",
            data:{"name":$("txtName").val()},
            success:function(data,status){
                console.log(data)
                console.log(status)
            }
        })
    }


</script>
用户名：
    <input type="text" id="txtName" onblur="a1()">





</body>
</html>

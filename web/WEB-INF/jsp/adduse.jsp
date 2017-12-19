<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2017/7/7
  Time: 下午6:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>


<form action="${pageContext.request.contextPath}/user/addUser.action" method="post">

    学生姓名<input type="text"  name="name" />

    <input type="submit" value="添加"/>
</form>

</body>
</html>

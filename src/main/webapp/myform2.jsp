<%--
  Created by IntelliJ IDEA.
  User: yangyondgfeng
  Date: 2022/3/15
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/MyForm2_getData.do" method="post">
    姓名:<input type="text" name="userMap['username']"><br>
    电话:<input type="text" name="userMap['telephone']"><br>
    <input type="submit" value="提交">

</form>
</body>
</html>

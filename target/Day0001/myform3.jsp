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
<form action="/MyForm3_getData.do" method="post">
    姓名1：<input type="text" name="list[0].username"><br>
    姓名1：<input type="text" name="list[0].telephone"><br>
    姓名2：<input type="text" name="list[1].username"><br>
    姓名2：<input type="text" name="list[1].telephone"><br>
<input type="submit" value="提交">
</form>
</body>
</html>

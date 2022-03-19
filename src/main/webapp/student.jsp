<%--
  Created by IntelliJ IDEA.
  User: yangyondgfeng
  Date: 2022/3/17
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生表单</title>
</head>
<body>
<form action="/Student_getData.do" method="post">
    姓名:<input type="text" name="userMap.username"><br>
    电话:<input type="text" name="userMap.telephone"><br>
    地址:<input type="text" name="userMap.address"><br>
    学号:<input type="text" name="userMap.studentid"><br>
    生日:<input type="datetime-local" name="userMap.birthday"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yangyondgfeng
  Date: 2022/3/17
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
展示出值栈的所有数据
<s:debug/>
展示所有数据
姓名:<s:property value="userMap.username"></s:property><br>
电话:<s:property value="userMap.telephone"></s:property><br>
地址:<s:property value="userMap.address"></s:property><br>
学号:<s:property value="userMap.studentid"></s:property><br>
生日:<s:property value="userMap.birthday"></s:property><br>
<s:iterator value="lists">
    a:<s:property value="a"></s:property>
    b:<s:property value="b"></s:property><br>
</s:iterator>
</body>
</html>

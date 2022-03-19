<%--
  Created by IntelliJ IDEA.
  User: yangyondgfeng
  Date: 2022/3/18
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增学籍</title>
</head>
<body>
<form action="/Student_insertStudent.do" method="post">
    <style>
        table,tr,td{
            border: 1px solid red;
            border-collapse: collapse;

        }
        table{
            text-align: center;
            margin-left:auto;
            margin-right: auto;
        }
    </style>
    <table>
        <tr>
            <td>
                姓名:<input type="text" name="studentMap.stu_name">
            </td>
        </tr>
        <tr>

            <td>性别:<input type="radio" name="studentMap.stu_sex" value="男">男
                <input type="radio" name="studentMap.stu_sex" value="女">女
            </td>


        </tr>
        <tr>

            <td>
                生日: <input type="date" name="studentMap.stu_birthday">
            </td>
        </tr>
        <tr>

            <td>
                地址:  <input type="text" name="studentMap.stu_address">
            </td>
        </tr>
        <tr>

            <td>
                电话:  <input type="text" name="studentMap.stu_telephone">
            </td>
        </tr>
        <tr>

            <td><input type="submit" value="提交按钮"></td>
        </tr>
    </table>

</form>
</body>
</html>

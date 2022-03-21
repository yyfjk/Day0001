package org.example.action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class StudentDao {
    public void  insertDao(Connection connection,Map map) throws SQLException {
        //
        String sql="insert into student(stu_name,stu_sex,stu_birthday,stu_address,stu_telephone)"+
                "value (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //参数名称
        preparedStatement.setObject(1,((String[])map.get("stu_name"))[0].toString());
        preparedStatement.setObject(2,((String[])map.get("stu_sex"))[0].toString());
        preparedStatement.setObject(3,((String[])map.get("stu_birthday"))[0].toString());
        preparedStatement.setObject(4,((String[])map.get("stu_address"))[0].toString());
        preparedStatement.setObject(5,((String[])map.get("stu_telephone"))[0].toString());
        preparedStatement.execute();
        preparedStatement.close();//关闭资源


    }

}

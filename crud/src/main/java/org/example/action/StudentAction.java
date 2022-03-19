package org.example.action;

import org.example.action.dao.StudentDao;
import text.TextDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class StudentAction {
    public Map studentMap = new HashMap();
    public StudentDao studentDao = new StudentDao();


    public Map getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map studentMap) {
        this.studentMap = studentMap;
    }


    public String insertStudent() {
        System.out.println(studentMap);
        Connection connection = null;
        try {
            connection=TextDB.getConnection();
            studentDao.insertDao(connection, studentMap);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return "Student_insertStudent";
    }

}

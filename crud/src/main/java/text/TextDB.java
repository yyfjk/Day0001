package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TextDB {
    //1.加载驱动,在静态代码中加载驱动
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //2.获取连接
    static String url = "jdbc:mysql://localhost:3306/struts2";
    static String username = "root";
    static String password = "root";

    public static Connection getConnection() throws SQLException {


        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        System.out.println(connection);
        connection.close();
    }
}

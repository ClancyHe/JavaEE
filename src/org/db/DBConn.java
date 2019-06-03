package org.db;

import java.sql.*;

public class DBConn
{
    public static Connection Conn;
    public static Connection getConn()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useSSL=false&characterEncoding=utf-8","root","123456");
            return Conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void CloseConn()
    {
        try {
            Conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

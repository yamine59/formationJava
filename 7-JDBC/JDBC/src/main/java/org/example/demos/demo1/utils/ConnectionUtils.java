package org.example.demos.demo1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getSqlConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";
        String username = "root";
        String password = "yamine";

        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }
}

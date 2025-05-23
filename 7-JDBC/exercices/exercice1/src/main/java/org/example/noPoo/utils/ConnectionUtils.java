package org.example.noPoo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static final String url = "jdbc:mysql://localhost:3306/exercice_jdbc";
    private static final String username = "root";
    private static final String password = "yamine";

    public static Connection getSqlConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }
}

package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URI = "jdbc:mysql://localhost:3306/exercice2_jdbc_bank";
    private static final String USER = "root";
    private static final String PASSWORD = "test";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URI,USER,PASSWORD);
    }
}

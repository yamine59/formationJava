package org.example.demos.demo1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils2 {
    public static Connection getSqlConnection()  {
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";
        String username = "root";
        String password = "yamine";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,username,password);
            if (connection != null){
                System.out.println("Connexion est OK !!!");
            }else{
                System.out.println("Connexion échoué");
            }
        }catch (SQLException e ){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}

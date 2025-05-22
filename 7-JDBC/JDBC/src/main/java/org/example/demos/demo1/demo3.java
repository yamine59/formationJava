package org.example.demos.demo1;

import org.example.demos.demo1.utils.ConnectionUtils;

import java.sql.*;

public class demo3 {
    public static void main(String[] args) {
        Connection connection = null;
        String request = "SELECT * FROM users";
        try {
            connection = ConnectionUtils.getSqlConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(request);
//            while (resultSet.next()){
//                System.out.print("La colonne id : "+resultSet.getInt("id"));
//                System.out.print(", La colonne prenom : "+resultSet.getString("firstname"));
//                System.out.println(", La colonne nom : "+resultSet.getString("lastname"));
//                System.out.println();
//
//            }
            String request2 = "SELECT * FROM users WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(request2);
            preparedStatement.setInt(1,3);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                System.out.print("Son id : "+resultSet.getInt("id"));
                System.out.print(", Son prenom : "+resultSet.getString("firstname"));
                System.out.println(", Son nom : "+resultSet.getString("lastname"));
                System.out.println();
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if (connection != null){
                try {
                    connection.close();
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

package org.example.demos.demo1;

import org.example.demos.demo1.utils.ConnectionUtils;
import org.example.demos.demo1.utils.ConnectionUtils2;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        //Connection connection = ConnectionUtils2.getSqlConnection();
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
       try {
           connection = ConnectionUtils.getSqlConnection();
           System.out.println("connecter a la bdd");
           System.out.println("Veillez saisir le prenom : ");
           String firstname = scanner.nextLine();
           System.out.println("Veillez saisir le nom : ");
           String lastname = scanner.nextLine();


           String request = "INSERT INTO users (firstname,lastname) VALUES (?,?)";
//           PreparedStatement preparedStatement = connection.prepareStatement(request);
           PreparedStatement preparedStatement = connection.prepareStatement(request,Statement.RETURN_GENERATED_KEYS);
           preparedStatement.setString(1,firstname);
           preparedStatement.setString(2,lastname);

           int nbrRows = preparedStatement.executeUpdate();
           if (nbrRows>0){
               System.out.println("Requete executée ");
               System.out.println("ajoute de : "+nbrRows + " utilisateur");
           }else {
               System.out.println("ERROR : Requete Create users");
           }

           ResultSet resultSet = preparedStatement.getGeneratedKeys();
           if (resultSet.next()){
               System.out.println("id de l'utilisateur est : "+resultSet.getInt(1));
           }

       }catch (SQLException e){
           System.out.println(e.getMessage());
       }finally {
           if (connection != null){
               try {
                   connection.close();
               }catch (SQLException e){
                   e.printStackTrace();
               }
           }
       }
        

    }
}

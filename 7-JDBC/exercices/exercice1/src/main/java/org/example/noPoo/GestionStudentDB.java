package org.example.noPoo;

import org.example.noPoo.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class GestionStudentDB {

    public void registerStudant() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un nom : ");
        String lastname = scanner.nextLine();
        System.out.println("Entrer un prenom : ");
        String firstname = scanner.nextLine();
        System.out.println("Entrer le numero de classe : ");
        int classNumber = scanner.nextInt();
        System.out.println("Entrer la date du diplome : ");
        scanner.nextLine();
        String diplome = scanner.nextLine();



        String request = "INSERT INTO student (firstname,lastname,class_number,diplome_date) VALUES (?,?,?,?)";
        try {
            Connection connection = ConnectionUtils.getSqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(request);

            preparedStatement.setString(1,firstname);
            preparedStatement.setString(2,lastname);
            preparedStatement.setInt(3, classNumber);
            preparedStatement.setString(4,diplome);

            int nbrRows = preparedStatement.executeUpdate();
            if (nbrRows>0){
                System.out.println("Requete executée ");
                System.out.println("ajoute de : "+nbrRows + " etudient.");
            }else {
                System.out.println("ERROR : Requete Create users");
            }



        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void showAllStudant() {
        String request = "select * from student ";
        try {
            Connection connection = ConnectionUtils.getSqlConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);

            while (resultSet.next()){
                System.out.print("id : "+ resultSet.getInt("id"));
                System.out.print(" , nom : "+ resultSet.getString("lastname"));
                System.out.print(" , prenom : "+ resultSet.getString("firstname"));
                System.out.print(" , n° classe : "+ resultSet.getString("class_number"));
                System.out.print(" , diplome : "+ resultSet.getString("diplome_date"));
                System.out.println();
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }


    public void showAllClass() {
        String request = "select class_number from student ";
        try {
            Connection connection = ConnectionUtils.getSqlConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);

            while (resultSet.next()){
                System.out.println("classe n°"+ resultSet.getInt("class_number"));

            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void ClassStudant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre le numero de la classe");
        int idClass = scanner.nextInt();


        String request = "select * from student where class_number = ? ";
        try {
            Connection connection = ConnectionUtils.getSqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setInt(1,idClass);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                System.out.print("id : "+ resultSet.getInt("id"));
                System.out.print(" , nom : "+ resultSet.getString("lastname"));
                System.out.print(" , prenom : "+ resultSet.getString("firstname"));
                System.out.print(" , classe : "+ resultSet.getString("class_number"));
                System.out.print(" , diplome : "+ resultSet.getString("diplome_date"));
                System.out.println();

            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer l'id de l'etudiant a supprimer");
        int idStudent = scanner.nextInt();


        String request = "delete from student where id = ? ";
        try {
            Connection connection = ConnectionUtils.getSqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setInt(1, idStudent);
            int resultSet = preparedStatement.executeUpdate();

            if (resultSet>0){
                System.out.println("eleve supprimer");
            }



        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

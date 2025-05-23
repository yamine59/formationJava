package org.example.Poo;



import org.example.Poo.entity.Student;
import org.example.Poo.utils.DatabaseManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionStudent {

    private String request;

    private Connection connection;

    private PreparedStatement statement;


    // Sauvegarder un student en bdd
    public void save(Student student) throws SQLException {
        request = "INSERT INTO student (firstname,lastname,diplome_date,class_number) values (?,?,?,?)";
        connection = new DatabaseManager().getConnection();
        statement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,student.getFirstName());
        statement.setString(2,student.getLastName());
        statement.setString(3,student.getDateDegree());
        statement.setInt(4,student.getClassNumber());
        int rowNb = statement.executeUpdate();
        ResultSet resultSet = statement.getGeneratedKeys();
        if (resultSet.next()){
            student.setId(resultSet.getInt(1));
        }
        System.out.println(rowNb+" ligne ajouté");
        System.out.println("Etudiant ajouté : "+student);
        if (connection != null){
            try {
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void delete(int id) throws SQLException {
        request = "DELETE FROM student where id = ?";
        // ouverture connection
        connection = new DatabaseManager().getConnection();
        statement = connection.prepareStatement(request);
        statement.setInt(1,id);
        int nbRow = statement.executeUpdate();
        System.out.println(nbRow+" ligne supprimé");
        // fermeture connection
        if (connection != null){
            try {
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public Student getById(int id) throws SQLException {
        Student student = null;
        request = "SELECT * FROM student where id = ?";
        // ouverture connection
        connection = new DatabaseManager().getConnection();
        statement = connection.prepareStatement(request);
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        if(resultSet.next()){
            student = new Student(resultSet.getInt("id"),resultSet.getString("firstname"),resultSet.getString("lastname"),resultSet.getString("diplome_date"),resultSet.getInt("class_number"));
        }
        // fermeture connection
        if (connection != null){
            try {
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return student;
    }

    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        request = "SELECT * FROM student";
        // ouverture connection
        connection = new DatabaseManager().getConnection();
        statement = connection.prepareStatement(request);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            Student student = new Student(resultSet.getInt("id"),resultSet.getString("firstname"),resultSet.getString("lastname"),resultSet.getString("diplome_date"),resultSet.getInt("class_number"));
            students.add(student);
        }
        // fermeture connection
        if (connection != null){
            try {
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return students;
    }

    public List<Student> getByClass(int classNumber) throws SQLException {
        List<Student> students = new ArrayList<>();
        request = "SELECT * FROM student where class_number = ?";
        // ouverture connection
        connection = new DatabaseManager().getConnection();
        statement = connection.prepareStatement(request);
        statement.setInt(1,classNumber);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            Student student = new Student(resultSet.getInt("id"),resultSet.getString("firstname"),resultSet.getString("lastname"),resultSet.getString("diplome_date"),resultSet.getInt("class_number"));
            students.add(student);
        }
        // fermeture connection
        if (connection != null){
            try {
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return students;
    }
}

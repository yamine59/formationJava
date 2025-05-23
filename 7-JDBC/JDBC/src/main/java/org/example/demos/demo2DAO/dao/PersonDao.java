package org.example.demos.demo2DAO.dao;

import org.example.demos.demo2DAO.model.Person;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDao extends BaseDao<Person> {
    public PersonDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Person element) throws SQLException {
        C
    }

    @Override
    public boolean update(Person element) throws SQLException {
        request = "UPDATE users SET firstname = ?,lastname = ? where id = ?";
        statement = connection.prepareStatement(request);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setInt(3, element.getId());
        int nbrRows = statement.executeUpdate();
        return nbrRows == 1;
    }

    @Override
    public boolean delete(Person element) throws SQLException {
        request = "DELETE FROM users where id = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1, element.getId());
        int nbrRows = statement.executeUpdate();
        return nbrRows == 1;
    }


    @Override
    public Person get(int id) throws SQLException {
        request = "SELECT * FROM users where id = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        Person person = null;
        if (resultSet.next()){
            person = new Person(
                    resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"));
        }
        return person;
    }

    @Override
    public List<Person> get() throws SQLException {
        List<Person> persons = new ArrayList<>();
        request = "SELECT * FROM users";
        statement = connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Person person = new Person(resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"));
            persons.add(person);
        }
        return persons;
    }
}

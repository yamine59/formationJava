package org.example.dao;

import org.example.model.Account;
import org.example.model.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao extends BaseDao<Customer>{
    public CustomerDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Customer element) throws SQLException {
        int nbrRows2 = 0;
        request = "INSERT INTO clients (lastname, firstname,phone) VALUES (?,?,?)";
        statement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstname());
        statement.setString(2, element.getLastname());
        statement.setString(3, element.getPhone());
        int nbrRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if (resultSet.next()) {
            int idClient = resultSet.getInt(1);
            element.setId(idClient);
            Account account = new Account(idClient,0);
            request = "INSERT INTO accounts (idClient) VALUES (?)";
            statement = connection.prepareStatement(request);
            statement.setInt(1, idClient);
            nbrRows2 = statement.executeUpdate();
        }
        return nbrRows == 1 && nbrRows2 == 1;
    }

    @Override
    public boolean update(Customer element) throws SQLException {
        request = "UPDATE clients SET lastname = ?,firstname = ?,phone = , where id = ?";
        statement = connection.prepareStatement(request);
        statement.setString(1, element.getLastname());
        statement.setString(2, element.getFirstname());
        statement.setString(3, element.getPhone());
        statement.setInt(4, element.getId());
        int nbrRows = statement.executeUpdate();
        return nbrRows == 1;
    }

    @Override
    public boolean delete(Customer element) throws SQLException {
        request = "DELETE FROM clients where id = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1, element.getId());
        int nbrRows = statement.executeUpdate();
        return nbrRows == 1;
    }

    @Override
    public Customer get(int id) throws SQLException {
        request = "SELECT * FROM users where id = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        Customer client = null;
        if (resultSet.next()){
            client = new Customer(
                    resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"),
                    resultSet.getString("phone"));

        }
        return client;
    }

    @Override
    public List<Customer> get() throws SQLException {
        List<Customer> clients = new ArrayList<>();
        request = "SELECT * FROM users";
        statement = connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Customer client = new Customer(resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"),
                    resultSet.getString("phone"));
            clients.add(client);
        }
        return clients;
    }


}

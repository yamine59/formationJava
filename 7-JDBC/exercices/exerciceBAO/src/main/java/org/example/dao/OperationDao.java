package org.example.dao;

import org.example.model.Account;
import org.example.model.Customer;
import org.example.model.Operation;

import java.sql.*;
import java.util.List;

public class OperationDao extends BaseDao <Operation>{


    protected OperationDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Operation element) throws SQLException {
        request = "INSERT INTO operation (amount,status,idAccount) VALUES (?,?,?)";
        statement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getMontant());
        statement.setInt(2, element.getStatus());
        statement.setInt(3, element.getId());
        int nbrRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if (resultSet.next()) {
            element.setId(resultSet.getInt(1));
        }
        return nbrRows == 1;
    }

    @Override
    public boolean update(Operation element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Operation element) throws SQLException {
        return false;
    }

    @Override
    public Operation get(int id) throws SQLException {
        request = "SELECT * FROM users where id = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        Operation operation = null;
        if (resultSet.next()){
            operation = new Operation(
                    resultSet.getInt("idAccount"),
                    resultSet.getInt("idClient"),
                    resultSet.getDouble("amount"),
                    resultSet.getInt("status"));
        }
        return operation;
    }

    @Override
    public List<Operation> get() throws SQLException {
        return List.of();
    }


}

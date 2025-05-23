package org.example.dao;

import org.example.model.Account;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AccountDao extends BaseDao{


    public AccountDao(Connection connection) {
        super(connection);
    }

    public boolean update(double m , int idclient) throws SQLException {

        request = "UPDATE accounts SET totalAmount = ? where idClient = ?";
        statement = connection.prepareStatement(request);
        statement.setDouble(1, m);
        statement.setInt(2, idclient);
        int nbrRows = statement.executeUpdate();
        return nbrRows == 1;
    }

    public Account getAccount(int id) throws SQLException {
        request = "SELECT * FROM accounts where idClient = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        Account account = null;
        if (resultSet.next()){
            account = new Account(
                    resultSet.getInt("idClient"),
                    resultSet.getDouble("totalAmount"));
        }

        return account;
    }


    @Override
    public boolean save(Object element) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Object element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Object element) throws SQLException {
        return false;
    }

    @Override
    public Object get(int id) throws SQLException {
        return null;
    }

    @Override
    public List get() throws SQLException {
        return List.of();
    }
}

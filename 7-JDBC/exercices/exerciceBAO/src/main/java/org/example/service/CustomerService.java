package org.example.service;

import org.example.dao.AccountDao;
import org.example.dao.CustomerDao;
import org.example.dao.OperationDao;
import org.example.model.Customer;
import org.example.model.Operation;
import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class CustomerService {

    private CustomerDao customerDao;
    private Connection connection;
    private AccountDao accountDao;
    private OperationDao operationDao;

    public CustomerService() {
        try {
            connection = new DatabaseManager().getConnection();
            customerDao = new CustomerDao(connection);
            accountDao = new AccountDao(connection);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean createClient(String firstName, String lastName,String phone){
        Customer client = new Customer(firstName,lastName,phone);
        try {
            if(customerDao.save(client)){
                return true;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void watch(int idClient){

        try {
            System.out.println(accountDao.getAccount(idClient));;


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public void depot(int idClient,double montant){

        try {
            double depot = accountDao.getAccount(idClient).getTotalAccount() + montant;

//            Operation operation = new Operation(1,montant,idClient);
//            operationDao.save(operation);
            accountDao.update(depot,idClient);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public void retrait(int idClient,double montant){

        try {
            double depot = accountDao.getAccount(idClient).getTotalAccount() - montant;
            accountDao.update(depot,idClient);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }


}

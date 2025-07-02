package org.example.customer.service;

import org.example.customer.entity.Customer;
import org.example.customer.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    public Customer get(int id){
        return customerRepo.findById(id).orElse(null);
    }
    public List<Customer> get(){
        return customerRepo.findAll();
    }

    public Customer save (Customer customer){
        return customerRepo.save(customer);
    }

    public Customer Update (int id ,Customer customer){
        customer.setCustomer_id(id);
        return customerRepo.save(customer);
    }

    public void delete(int id){
        customerRepo.deleteById(id);
    }
}

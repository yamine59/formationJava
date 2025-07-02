package org.example.customer.controller;

import org.example.customer.entity.Customer;
import org.example.customer.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Customer> getAll (){
        return service.get();
    }

    @GetMapping("/{id}")
    public Customer get(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping
    public Customer save (@RequestBody Customer customer){
        return service.save(customer);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable int id,@RequestBody Customer customer){
        return service.Update(id,customer);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id){
        service.delete(id);
    }
}

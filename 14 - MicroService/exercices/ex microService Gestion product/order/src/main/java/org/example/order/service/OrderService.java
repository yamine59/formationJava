package org.example.order.service;

import org.example.order.Repository.OrderRepo;
import org.example.order.dto.OrderReceiveDto;
import org.example.order.entity.Customer;
import org.example.order.entity.Order;
import org.example.order.entity.Product;
import org.example.order.util.RestOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order get(int id){
        Order order = orderRepo.findById(id).orElse(null);
        RestOrder<Customer> customerRestOrder = new RestOrder<>();
        RestOrder<Product> productRestOrder = new RestOrder<>();
        Customer customer = customerRestOrder.get("http://localhost:8080/api/customer/"+order.getCustomerId(),Customer.class);
        Product product = productRestOrder.get("http://localhost:8081/api/product/"+order.getProductId(),Product.class);
        order.setCustomer(customer);
        order.setProduct(product);
        return order;
    }
    public List<Order> get() {
        List<Order> orders = orderRepo.findAll();
        RestOrder<Customer> customerRestOrder = new RestOrder<>();
        RestOrder<Product> productRestOrder = new RestOrder<>();
        for (Order order : orders) {
            Customer customer = customerRestOrder.get("http://localhost:8080/api/customer/" + order.getCustomerId(), Customer.class);
            Product product = productRestOrder.get("http://localhost:8081/api/product/" + order.getProductId(), Product.class);
            order.setCustomer(customer);
            order.setProduct(product);
        }
        return orders;
    }

    public Order save (OrderReceiveDto orderDto){

        RestOrder<Customer> customerRestOrder = new RestOrder<>();
        RestOrder<Product> productRestOrder = new RestOrder<>();
        Customer customer = customerRestOrder.get("http://localhost:8080/api/customer/"+orderDto.getCustomer(),Customer.class);
        Product product = productRestOrder.get("http://localhost:8081/api/product/"+orderDto.getProduct(),Product.class);

        Order order = orderDto.dtoToEntity(customer,product);
        return orderRepo.save(order);
    }

    public Order Update (int id , OrderReceiveDto orderDto){
        RestOrder<Customer> customerRestOrder = new RestOrder<>();
        RestOrder<Product> productRestOrder = new RestOrder<>();
        Customer customer = customerRestOrder.get("http://localhost:8080/api/customer"+orderDto.getCustomer(),Customer.class);
        Product product = productRestOrder.get("http://localhost:8081/api/product"+orderDto.getProduct(),Product.class);

        Order order = orderDto.dtoToEntity(customer,product);
        order.setId(id);
        return orderRepo.save(order);
    }

    public void delete(int id){
        orderRepo.deleteById(id);
    }
}

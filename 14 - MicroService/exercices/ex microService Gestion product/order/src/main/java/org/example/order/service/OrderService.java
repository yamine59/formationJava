package org.example.order.service;

import org.example.order.Repository.OrderRepo;
import org.example.order.dto.OrderRecieveDto;
import org.example.order.model.Customer;
import org.example.order.model.Order;
import org.example.order.model.Product;
import org.example.order.util.RestOrder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Order save (OrderRecieveDto order){

        RestOrder<Customer> customerRestOrder = new RestOrder<>();
        RestOrder<Product> productRestOrder = new RestOrder<>();
        Customer customer = customerRestOrder.get("http://localhost:8080/api/customer/"+order.getCustomer(),Customer.class);
        Product product = productRestOrder.get("http://localhost:8081/api/product/"+order.getProduct(),Product.class);

        Order order1 = Order.builder()
                .id(order.getId())
                .description(order.getDescription())
                .customer(customer)
                .product(product)
                .customerId(order.getCustomer())
                .productId(order.getProduct())
                .build();
        return orderRepo.save(order1);
    }

    public Order Update (int id ,OrderRecieveDto order){
        RestOrder<Customer> customerRestOrder = new RestOrder<>();
        RestOrder<Product> productRestOrder = new RestOrder<>();
        Customer customer = customerRestOrder.get("http://localhost:8080/api/customer"+order.getCustomer(),Customer.class);
        Product product = productRestOrder.get("http://localhost:8081/api/product"+order.getProduct(),Product.class);

        Order order1 = Order.builder()
                .id(order.getId())
                .description(order.getDescription())
                .customer(customer)
                .product(product)
                .customerId(order.getCustomer())
                .productId(order.getProduct())
                .build();

        return orderRepo.save(order1);
    }

    public void delete(int id){
        orderRepo.deleteById(id);
    }
}

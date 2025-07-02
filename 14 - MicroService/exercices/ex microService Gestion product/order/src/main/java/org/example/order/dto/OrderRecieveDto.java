package org.example.order.dto;

import lombok.Builder;
import lombok.Data;
import org.example.order.model.Customer;
import org.example.order.model.Order;
import org.example.order.model.Product;

@Builder
@Data
public class OrderRecieveDto {
    private int id;
    private String description;
    private int customer;
    private int product;

    public Order dtoToEntity(Customer customer, Product product){
       return Order.builder()
                .id(id)
                .description(description)
                .customer(customer)
                .product(product)
                .build();
    }
}

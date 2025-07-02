package org.example.order.dto;

import lombok.Builder;
import lombok.Data;
import org.example.order.entity.Customer;
import org.example.order.entity.Order;
import org.example.order.entity.Product;

@Builder
@Data
public class OrderReceiveDto {
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
                .customerId(customer.getCustomer_id())
                .productId(product.getProduct_id())
                .build();
    }
}

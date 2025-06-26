package org.example.ex_sessions_product.dto;

import lombok.Data;
import org.example.ex_sessions_product.entity.Product;

@Data
public class ProductReceiveDto {
    private Long id;
    private String name;
    private int quantity;
    private double price;

    public Product dtoToEntity() {
        return Product.builder()
                .id(id)
                .name(name)
                .quantity(quantity)
                .price(price)
                .build();
    }
}

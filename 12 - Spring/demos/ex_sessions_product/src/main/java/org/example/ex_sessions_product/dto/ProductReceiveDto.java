package org.example.ex_sessions_product.dto;

import lombok.Data;
import org.example.ex_sessions_product.entity.Product;

@Data
public class ProductReceiveDto {
    private String name;
    private double price;

    public Product dtoToEntity() {
        return Product.builder()
                .name(name)
                .price(price)
                .build();
    }
}

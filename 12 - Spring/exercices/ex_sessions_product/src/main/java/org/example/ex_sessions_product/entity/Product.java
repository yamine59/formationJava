package org.example.ex_sessions_product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.ex_sessions_product.dto.ProductResponseDto;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int quantity;
    private double price;

    public ProductResponseDto entityToDto() {
        return ProductResponseDto.builder()
                .id(id)
                .name(name)
                .quantity(quantity)
                .price(price)
                .build();
    }
}

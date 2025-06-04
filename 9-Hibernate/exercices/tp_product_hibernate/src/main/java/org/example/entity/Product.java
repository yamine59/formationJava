package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    private String brand;
    private String reference;
    private LocalDate purchasedate;
    private double price;
    private int stock;

    @OneToMany(mappedBy = "product")
    private List<Image> images;

    @OneToMany(mappedBy = "product")
    private List<Comment> comments;

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", brand='" + brand + '\'' +
                ", reference='" + reference + '\'' +
                ", purchasedate=" + purchasedate +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}

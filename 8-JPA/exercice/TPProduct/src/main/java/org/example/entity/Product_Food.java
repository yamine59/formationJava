package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class Product_Food extends Product {
    private String expiryDate;

    @Override
    public String toString() {
        return "id : " + id + ", Product food : nom : " + name + ", prix : " + price + ", date d'expiration : " + expiryDate;
    }
}

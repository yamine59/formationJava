package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.swing.*;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class Product_Housing extends Product {
    private String height;
    private String width;

    @Override
    public String toString() {
        return "id : " + id + ", Product_housing : nom : " + name + ", prix : " + price + ", hauteur : " + height + ", largeur : " + width;
    }
}

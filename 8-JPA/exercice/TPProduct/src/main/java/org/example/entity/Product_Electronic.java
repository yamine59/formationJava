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
public class Product_Electronic extends Product{
    private String batteryDuration;

    @Override
    public String toString() {
        return "id : " + id + ", Product_Electronic : nom : " + name + ", prix : " + price + ", duree de la batterie : " + batteryDuration;
    }
}

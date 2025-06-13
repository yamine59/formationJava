package org.example.apivoiture.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Car {
    private int id;
    private String brand;
    private String yearOfManufacture;
    private String color;
}

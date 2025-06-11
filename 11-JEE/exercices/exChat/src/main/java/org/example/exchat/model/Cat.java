package org.example.exchat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Cat {
    private String name;
    private String breed;
    private String favouriteFood;
    private LocalDate birthDate;
}

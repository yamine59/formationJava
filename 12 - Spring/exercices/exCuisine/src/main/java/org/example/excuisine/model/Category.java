package org.example.excuisine.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Category {
    private UUID id;
    @NotBlank
    @Size(min = 3 , max = 50)
    private String nom;
    @NotBlank
    private String description;

}

package org.example.excuisine.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Recipe {
    private UUID id;
    @NotBlank
    @Size(min = 3 , max = 50, message = "Le nom de la recette doit avoir entre 3 et 50 caractères")
    private String nom;
    @NotNull
    private List<String> ingredients;
    @NotBlank(message = "les instructions ne peuvent pas être vide")
    private String Instructions;
    private UUID categorie_id;
    private Category categorie;
}

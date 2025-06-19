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
public class Recette {
    private UUID id;
    @NotBlank
    @Size(min = 3 , max = 50, message = "Le nom de la recette doit avoir entre 3 et 50 caractères")
    private String nom;
    @NotNull
    private List<String> ingredients;
    @NotBlank(message = "les instructions ne peuvent pas être vide")
    private String Instructions;
    @NotBlank(message = "la catégorie ne peut pas être vide ou creer une nouvelle catégorie : ")
    private String categorie_id;
    private Categorie categorie;
}

package org.example.personne.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Personne {
    private Integer id;
    private String nom;
    private Adresse adresse;
}

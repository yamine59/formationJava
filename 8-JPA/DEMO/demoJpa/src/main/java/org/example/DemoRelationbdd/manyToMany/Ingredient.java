package org.example.DemoRelationbdd.manyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIng;
    private String name;
    private double price;

    @ManyToMany(mappedBy = "ingredients")
    private List<Recette> recettes;
}

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
public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRec;
    private String name;

    @ManyToMany
    @JoinTable(name = "recette_ingredient",
            joinColumns = @JoinColumn(name = "idRec"),
            inverseJoinColumns = @JoinColumn(name = "idIng"))
    private List<Ingredient> ingredients;
}

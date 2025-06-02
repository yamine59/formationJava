package org.example.DemoHeritage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    protected String nom;
    protected String prenom;
}
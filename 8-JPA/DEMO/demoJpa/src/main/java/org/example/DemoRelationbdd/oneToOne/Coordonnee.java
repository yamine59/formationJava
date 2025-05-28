package org.example.DemoRelationbdd.oneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coordonnee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCrd;

    private String adress;
    private int codePostal;

}

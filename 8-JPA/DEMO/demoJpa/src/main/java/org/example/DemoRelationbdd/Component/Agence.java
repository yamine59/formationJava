package org.example.DemoRelationbdd.Component;

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
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;
    private String libelle;

    @Embedded
    private Adress adress;

}

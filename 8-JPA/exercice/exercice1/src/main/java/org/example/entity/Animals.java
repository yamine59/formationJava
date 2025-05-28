package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Animals {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private Diet diet;
    private String arrivalDate;


}

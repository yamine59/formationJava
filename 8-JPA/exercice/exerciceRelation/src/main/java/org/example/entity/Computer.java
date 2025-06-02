package org.example.entity;

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
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;

    @Embedded
    private Identification identification;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idProc")
    private Processor processor;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idOpe")
    private OperatingSystem operatingSystem;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "computer_project",
    joinColumns= @JoinColumn(name = "id"),
    inverseJoinColumns =@JoinColumn(name = "idProjet")  )
    private List<Project>projects;


    public void addToProject( Project project) {
        projects.add(project);
    }



}

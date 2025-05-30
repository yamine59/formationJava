package org.example.entity;

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
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    @Embedded
    private Identification identification;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idproc")
    private Processor processor;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idope")
    private OperatingSystem operatingSystem;

}

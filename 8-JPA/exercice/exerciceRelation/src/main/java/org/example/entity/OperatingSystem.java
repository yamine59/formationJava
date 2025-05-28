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
public class OperatingSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOpe;
    private String name;
    private String version;

    @OneToMany(mappedBy = "operatingSystem")
    private List<Computer> computers;

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "idOpe=" + idOpe +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}


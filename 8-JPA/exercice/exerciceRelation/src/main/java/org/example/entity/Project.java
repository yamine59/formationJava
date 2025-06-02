package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.namespace.QName;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProject;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "projects")
    private List<Computer>computers;

    @Override
    public String toString() {
        return "Project{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", idProject=" + idProject +
                '}';
    }
}

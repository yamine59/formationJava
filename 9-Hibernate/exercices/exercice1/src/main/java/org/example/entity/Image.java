package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String url;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idProduct")
    private Product product;

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                ", id=" + id +
                '}';
    }
}

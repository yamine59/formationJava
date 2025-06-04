package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;
    private String content;
    private LocalDate date;
    private int note;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idProduct")
    private Product product;

    @Override
    public String toString() {
        return "Comment{" +
                "idComment=" + idComment +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", note=" + note +
                '}';
    }
}

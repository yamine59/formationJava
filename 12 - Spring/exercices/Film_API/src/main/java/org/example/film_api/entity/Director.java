package org.example.film_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.film_api.dto.DirectorReceiveDto;
import org.example.film_api.dto.DirectorResponseDto;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long director_id;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String nationality;

    @OneToMany(mappedBy = "director")
    @JsonManagedReference
    private List<Movie> movies;

    public DirectorResponseDto entityToDto() {
        if (this.movies == null) {
            return null;
        }
        return DirectorResponseDto.builder()
                .director_id(this.director_id)
                .firstname(this.firstname)
                .lastname(this.lastname)
                .birthday(this.birthday)
                .nationality(this.nationality)
                .movies(this.movies.stream().map(Movie::entityToDto).toList())
                .build();
    }
}

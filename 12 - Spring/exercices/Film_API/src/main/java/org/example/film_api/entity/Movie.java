package org.example.film_api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.film_api.dto.MovieResponseDto;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movie_id;
    private String name;
    private LocalDate release_date;
    private String description;
    private double duration;
    private String genre;

    @ManyToOne
    @JoinColumn(name = "director_id")
    @JsonIgnoreProperties("movies")
    private Director director;

    public MovieResponseDto entityToDto () {
        return MovieResponseDto.builder()
                .movie_id(this.movie_id)
                .name(this.name)
                .releaseDate(this.release_date.toString())
                .description(this.description)
                .duration(this.duration)
                .genre(this.genre)
                .director(this.director.getFirstname() + " " + this.director.getLastname())
                .build();
    }

}

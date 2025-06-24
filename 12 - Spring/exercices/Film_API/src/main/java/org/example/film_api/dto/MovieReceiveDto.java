package org.example.film_api.dto;

import lombok.Data;
import org.example.film_api.entity.Director;
import org.example.film_api.entity.Movie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@Data
public class MovieReceiveDto {
    private String name;
    private String releaseDateStr;
    private String description;
    private double duration;
    private String genre;
    private Long directorId;

    public Movie dtoToEntity(Director director) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Movie.builder()
                .name(this.name)
                .release_date(LocalDate.parse(this.releaseDateStr, formatter))
                .description(this.description)
                .duration(this.duration)
                .genre(this.genre)
                .director(director)
                .build();
    }
}

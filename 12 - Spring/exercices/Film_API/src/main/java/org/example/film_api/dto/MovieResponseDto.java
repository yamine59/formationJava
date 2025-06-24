package org.example.film_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MovieResponseDto {
    private long movie_id;
    private String name;
    private String releaseDate;
    private String description;
    private double duration;
    private String genre;
    private String director;
}

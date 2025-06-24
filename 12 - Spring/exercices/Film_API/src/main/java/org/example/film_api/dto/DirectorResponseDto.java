package org.example.film_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DirectorResponseDto {
    private long director_id;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String nationality;
    private List<MovieResponseDto> movies;
}

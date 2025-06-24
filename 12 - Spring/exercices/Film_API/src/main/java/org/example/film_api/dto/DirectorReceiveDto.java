package org.example.film_api.dto;

import lombok.Data;
import org.example.film_api.entity.Director;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class DirectorReceiveDto {
    private String firstname;
    private String lastname;
    private String birthdayStr;
    private String nationality;

    public Director dtoToEntity() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Director.builder()
                .firstname(this.firstname)
                .lastname(this.lastname)
                .birthday(LocalDate.parse(this.birthdayStr, formatter))
                .nationality(this.nationality)
                .build();
    }
}

package org.example.extodoapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.extodoapi.entity.Todo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoReceiveDto {

    private String title;
    private String description;
    private String date;

    public Todo dtoToEntity(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Todo.builder()
                .title(getTitle())
                .description(getDescription())
                .date(LocalDate.parse(getDate(),dateTimeFormatter))
                .build();
    }
}

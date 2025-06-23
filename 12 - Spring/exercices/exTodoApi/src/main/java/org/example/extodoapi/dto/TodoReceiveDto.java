package org.example.extodoapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.extodoapi.entity.Todo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoReceiveDto {
    private long id;
    private String title;
    private String description;
    private String date;
    private boolean isValidate;

    public Todo dtoToEntity(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Todo.builder()
                .id(id)
                .title(title)
                .description(description)
                .date(LocalDate.parse(date,dateTimeFormatter))
                .isValidate(false)
                .build();
    }
}

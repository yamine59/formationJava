package org.example.extodoapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.extodoapi.dto.TodoResponseDto;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String description;
    private LocalDate date;
    private boolean isValidate;

    public TodoResponseDto entityToDto() {
        return TodoResponseDto.builder()
                .id(id)
                .title(title)
                .description(description)
                .date(date)
                .isValidate(isValidate)
                .build();
    }
}

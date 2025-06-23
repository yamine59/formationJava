package org.example.extodoapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor@AllArgsConstructor
@Builder
@Data
public class TodoResponseDto {
    private UUID id;
    private String title;
    private String description;
    private LocalDate date;
    private boolean isValidate;
}

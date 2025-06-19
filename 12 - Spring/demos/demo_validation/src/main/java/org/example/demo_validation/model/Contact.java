package org.example.demo_validation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.Transient;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Contact {

    private Long id;

    @NotNull(message = "Le prénom est obligatoire")
    @NotBlank(message = "Le prénom est obligatoire")
    private String firstName;

    @NotNull(message = "Le nom est obligatoire")
    @Size(min = 3, max = 35,message = "Votre nom doit avoir entre 3 et 35 caractères")
    private String lastName;

    @Min(18)
    @Max(80)
    private Integer age;
}

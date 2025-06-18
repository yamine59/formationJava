package org.example.exstudent.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private UUID id;
    private String firstname;
    private String lastname;
    private String email;
    private int age;
}

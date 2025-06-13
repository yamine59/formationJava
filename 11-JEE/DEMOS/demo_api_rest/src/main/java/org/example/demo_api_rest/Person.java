package org.example.demo_api_rest;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    @Generated
    private int id;
    private String name;
    private int age;
}

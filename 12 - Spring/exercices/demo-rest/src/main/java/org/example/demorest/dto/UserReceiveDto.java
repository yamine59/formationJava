package org.example.demorest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.demorest.entity.User;
import org.springframework.context.annotation.Fallback;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserReceiveDto {
    private String name;
    private String birthdateStr;
    private String password;


    public User dtoToEntity() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return User.builder()
                .name(getName())
                .birthdate(LocalDate.parse(getBirthdateStr(), dateTimeFormatter))
                .password(getPassword())
                .build();
    }
}

package org.example.demorest.dto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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

    @Size(min = 3,max = 25)
    private String name;
    @Pattern(regexp = "[0-9]{2}[-|\\/]{1}[0-9]{2}[-|\\/]{1}[0-9]{4}")
    private String birthdateStr;
    @Size(min = 3)
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

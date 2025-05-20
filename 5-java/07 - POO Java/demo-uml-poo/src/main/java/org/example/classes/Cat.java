package org.example.classes;

import java.time.LocalDate;

public class Cat {
    private String name;
//    String name;
//    Integer age;
    private LocalDate birthDate;
    String breed;

    public Cat() {
        this.name = "Mistigri";
        this.birthDate = LocalDate.now().minusYears(1);
        this.breed = "Siamois";
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public void setName(String newName) {
        if (newName.equals("Berlioz")) return;
        this.name = newName;
    }

}

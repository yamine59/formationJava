package org.example.creational;

import org.example.creational.builder.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().firstName("toto").lastName("tata").age(23).build();
        System.out.println(person);
        person.setFirstName("ddddddddddddddddddd");
        System.out.println(person);
    }
}

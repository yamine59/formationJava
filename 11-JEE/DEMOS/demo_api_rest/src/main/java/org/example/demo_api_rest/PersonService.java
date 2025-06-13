package org.example.demo_api_rest;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonService {

 public Person save(int id, String name, int age) {
     return new Person(id, name, age);
 }
}

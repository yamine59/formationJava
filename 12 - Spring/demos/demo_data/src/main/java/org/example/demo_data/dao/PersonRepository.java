package org.example.demo_data.dao;

import org.example.demo_data.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//JpaRepository<Person, Integer>
//CrudRepository<Person, Integer>
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findPersonByFirstnameAndLastname(String firstname, String lastname);
}

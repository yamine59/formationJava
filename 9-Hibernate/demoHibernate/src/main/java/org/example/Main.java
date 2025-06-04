package org.example;

import org.example.dao.PersonneDao;
import org.example.entity.Personne;
import org.example.util.SessionFactorySingleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonneDao personneDao = new PersonneDao(SessionFactorySingleton.getSession());

//        Personne personne = Personne.builder().name("John").age(20).build();
//        personneDao.save(personne);

        Personne personneFound = personneDao.get(1);
        personneFound.setName("test");
        personneDao.save(personneFound);

    }
}
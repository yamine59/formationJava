package org.example.DemoHeritage;

import org.example.DemoHeritage.entity.Profeseur;
import org.example.DemoHeritage.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
        EntityManager em = emf.createEntityManager();

        Student student = Student.builder().nom("yamine").prenom("azerty").classe("TPI").build();

        Profeseur professeur = Profeseur.builder().nom("prof").prenom("prof").matiere("math").build();

        em.getTransaction().begin();
        em.persist(student);
        em.persist(professeur);
        em.getTransaction().commit();
    }
}

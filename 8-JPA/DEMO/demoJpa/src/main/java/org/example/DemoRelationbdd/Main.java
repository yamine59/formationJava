package org.example.DemoRelationbdd;

import org.example.DemoRelationbdd.Component.Adress;
import org.example.DemoRelationbdd.Component.Agence;
import org.example.DemoRelationbdd.manyToMany.Ingredient;
import org.example.DemoRelationbdd.manyToMany.Recette;
import org.example.DemoRelationbdd.oneToMany.Departement;
import org.example.DemoRelationbdd.oneToMany.Professeur;
import org.example.DemoRelationbdd.oneToOne.Coordonnee;
import org.example.DemoRelationbdd.oneToOne.Etudient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
        EntityManager em = emf.createEntityManager();

        Coordonnee coordonnee = Coordonnee.builder().adress("102 rue des poutrain").codePostal(59200).build();
        Etudient etudient = Etudient.builder().name("yamine").age("23").coordonnee(coordonnee).build();

//        em.getTransaction().begin();
//        em.persist(coordonnee);
//        em.persist(etudient);
//        em.getTransaction().commit();

//        System.out.println(em.find(Etudient.class,1));

        Adress adress = new Adress("tourcoing","france","59200");
        Agence agence = Agence.builder().code("557888").libelle("libelle").adress(adress).build();

//        em.getTransaction().begin();
//        em.persist(agence);
//        em.getTransaction().commit();

//        System.out.println(em.find(Agence.class,1));

        Departement departement = Departement.builder().name("informatique").build();
        Professeur professeur = Professeur.builder().name("prof").departement(departement).build();

//        em.getTransaction().begin();
//        em.persist(professeur);
//        em.getTransaction().commit();
//        em.createQuery("SELECT p FROM Professeur p ", Professeur.class).getResultList().forEach(System.out::println);
//        em.createQuery("SELECT d FROM Departement d ", Departement.class).getResultList().forEach(System.out::println);

//        Ingredient ingredient = Ingredient.builder().name("tomate").price(2).build();
//        Ingredient ingredient2 = Ingredient.builder().name("fromage").price(2).build();
//        Ingredient ingredient3 = Ingredient.builder().name("pain").price(2).build();
//        Recette recette1 = Recette.builder().name("pain a la tomate").build();
//        Recette recette2 = Recette.builder().name("pain au fromage").build();
//
//        em.getTransaction().begin();
//        em.persist(ingredient);
//        em.persist(ingredient2);
//        em.persist(ingredient3);
//        em.persist(recette1);
//        em.persist(recette2);
////
//        em.getTransaction().commit();


//        em.getTransaction().begin();
//        Recette recette1 = em.find(Recette.class,1);
//        Ingredient ingredient = em.find(Ingredient.class,1);
//        Ingredient ingredient2 = em.find(Ingredient.class,3);
//
//        recette1.getIngredients().add(ingredient);
//        recette1.getIngredients().add(ingredient2);
//
//        em.getTransaction().commit();

        Recette recette1 = em.find(Recette.class,1);
        System.out.println(recette1);

    }
}

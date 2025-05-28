package org.example.dao;

import org.example.entity.Animals;
import org.example.entity.Diet;

import javax.persistence.*;
import java.util.List;

public class AnimalsDao {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    public static EntityManager em = emf.createEntityManager();


   public void createAnimal(Animals animals){

       em.getTransaction().begin();
       em.persist(animals);
       em.getTransaction().commit();

   }

   public void getById(int id){
       try {
            Animals animalFind = em.getReference(Animals.class,id);
            System.out.println(animalFind);
        }catch (EntityNotFoundException e){
            System.out.println(e.getMessage());
        }
   }
    public void getByName(String name){
        TypedQuery<Animals> query = em.createQuery("SELECT a FROM Animals a where a.name = :name", Animals.class);
        query.setParameter("name",name);

        List<Animals> animals = query.getResultList();
        animals.forEach(System.out::println);
    }

    public void getByDiet(Diet diet){
        TypedQuery<Animals> query = em.createQuery("SELECT a FROM Animals a where a.diet = :diet", Animals.class);
        query.setParameter("diet",diet);

        List<Animals> animals = query.getResultList();
        animals.forEach(System.out::println);
    }
}

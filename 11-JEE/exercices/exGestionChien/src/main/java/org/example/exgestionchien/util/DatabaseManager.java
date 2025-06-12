package org.example.exgestionchien.util;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DatabaseManager {

    private static EntityManager entityManager;

    private DatabaseManager(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp_product");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public static synchronized EntityManager getEntityManager (){
        if(entityManager == null){
            new DatabaseManager();
        }
        return entityManager;
    }
}

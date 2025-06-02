package org.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

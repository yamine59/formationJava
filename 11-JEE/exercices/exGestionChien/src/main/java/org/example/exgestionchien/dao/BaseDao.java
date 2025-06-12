package org.example.exgestionchien.dao;


import jakarta.persistence.EntityManager;
import org.example.exgestionchien.util.DatabaseManager;

import java.util.List;

public abstract class BaseDao<T> {

    protected EntityManager em;

    public BaseDao() {
        em = DatabaseManager.getEntityManager();
    }

    public T save (T element){
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
        return element;
    }

    public T getById(int id,Class<T> tClass){
        return em.find(tClass,id);
    }

    public List<T> getAll(Class<T> tClass){
        List<T> elements = em.createQuery("SELECT p FROM " + tClass.getSimpleName() + " p").getResultList();
        return elements;
    }

    public T update(T element){
        try {
            em.getTransaction().begin();
            em.merge(element);
            em.getTransaction().commit();
            return element;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean remove(int id,Class<T> tClass){
        T element = em.find(tClass,id);
        if(element != null){
            em.getTransaction().begin();
            em.remove(element);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }


}


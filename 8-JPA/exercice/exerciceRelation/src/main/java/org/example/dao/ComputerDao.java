package org.example.dao;

import org.example.entity.Computer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;


public class ComputerDao {
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
    protected EntityManager em = emf.createEntityManager();

    public void createCumputer(Computer computer) {
        em.getTransaction().begin();
        em.persist(computer);
        em.getTransaction().commit();
    }

    public void getCumputer(int id){
        TypedQuery<Computer> query = em.createQuery("SELECT c FROM Computer c where id = :id ", Computer.class);
        query.setParameter("id",id);
        List<Computer> accounts = query.getResultList();
        accounts.forEach(System.out::println);
    }

    public void getAllCumputer(){
        TypedQuery<Computer> query = em.createQuery("SELECT c FROM Computer c ", Computer.class);
        List<Computer> accounts = query.getResultList();
        accounts.forEach(System.out::println);
    }

    public void updateComputer(int id,String model) {
        Computer computerToUpdate = em.find(Computer.class,id);
        em.getTransaction().begin();
        computerToUpdate.setModel(model);
        em.getTransaction().commit();
    }

    public void removeComputer(int id){
        Computer computerRemove = em.find(Computer.class,id);
        em.getTransaction().begin();
        em.remove(computerRemove);
        em.getTransaction().commit();
    }

}

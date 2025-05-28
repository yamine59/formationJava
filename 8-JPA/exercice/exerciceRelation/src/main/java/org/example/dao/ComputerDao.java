package org.example.dao;

import org.example.entity.Computer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;


public class ComputerDao extends BaseDao<Computer> {

    public List<Computer> getAll (){
        return em.createQuery("Select c from Computer c ", Computer.class).getResultList();
    }

}

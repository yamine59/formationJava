package org.example.gestionchien.dao;


import org.example.gestionchien.entity.Dog;
import org.example.gestionchien.util.SessionFactorySingleton;

import java.util.ArrayList;
import java.util.List;

public class DogDao extends BaseDAO<Dog>{
    public DogDao() {
        super(SessionFactorySingleton.getSessionFactory(), Dog.class);
    }

    @Override
    public List<Dog> get() {
        try{
            session = sessionFactory.openSession();
            System.out.println(session);
            return session.createQuery("select e from Dog e order by e.id desc", Dog.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }
}

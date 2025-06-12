package org.example.gestionchien.repository;


import org.example.gestionchien.entity.Dog;
import org.example.gestionchien.util.SessionFactorySingleton;

import java.util.ArrayList;
import java.util.List;

public class DogRepo extends BaseRepository<Dog> {
    public DogRepo() {
        super(SessionFactorySingleton.getSessionFactory(), Dog.class);
    }

    @Override
    public List<Dog> get() {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("from Dog e order by e.id desc", Dog.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }
}

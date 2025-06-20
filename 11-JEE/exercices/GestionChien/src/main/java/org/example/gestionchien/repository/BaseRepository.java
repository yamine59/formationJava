package org.example.gestionchien.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


public abstract class BaseRepository<T> {

    protected SessionFactory sessionFactory;
    protected Class<T> type;
    protected Session session;

    public BaseRepository(SessionFactory sessionFactory, Class<T> type) {
        this.sessionFactory = sessionFactory;
        this.type = type;
    }

    public T save (T element){
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(element);
            session.getTransaction().commit();
            return element;
        }catch (Exception ex){
            session.getTransaction().rollback();
            return null;
        }finally {
            session.close();
        }
    }

    public void delete (int id){
        T found = get(id);
        if(found !=null){
            try{
                session = sessionFactory.openSession();
                session.beginTransaction();
                session.delete(found);
                session.getTransaction().commit();
            }catch (Exception ex){
                session.getTransaction().rollback();
            }
            finally {
                session.close();
            }
        }else{
            System.out.println("Element at id : "+id+" not found");
        }
    }

    public T get (int id){
        try{
            session = sessionFactory.openSession();
            return session.get(type,id);
        }catch (Exception ex){
            return null;
        }finally {
            session.close();
        }
    }

    public abstract List<T> get();

}

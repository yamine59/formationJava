package org.example.dao;

import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.spi.SessionFactoryOptions;

import java.util.List;



public abstract class BaseDAO2 <T> {

    protected SessionFactory sessionFactory;
    protected Class<T> type;
    protected Session session;

    public BaseDAO2(SessionFactory sessionFactory,Class<T> type) {
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

    public boolean delete (int id){
        T found = get(id);
        if(found !=null){
            try{
                session = sessionFactory.openSession();
                session.beginTransaction();
                session.delete(found);
                session.getTransaction().commit();
                return true;
            }catch (Exception ex){
                session.getTransaction().rollback();
                return false;
            }
            finally {
                session.close();
            }
        }else{
            System.out.println("Element at id : "+id+" not found");
            return false;
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

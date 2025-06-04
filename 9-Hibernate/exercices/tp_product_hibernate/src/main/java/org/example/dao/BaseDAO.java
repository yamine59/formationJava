package org.example.dao;

import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.spi.SessionFactoryOptions;

import java.util.List;



public abstract class BaseDAO <T> {

    private Session session;
    private SessionFactory sessionFactory;

    public BaseDAO() {
        this.session = SessionFactorySingleton.getSessionFactory().openSession();
    }

    public T save(T element) {
        session.beginTransaction();
        session.saveOrUpdate(element);
        session.getTransaction().commit();
        return element;
    }

    public boolean delete (int id,Class<T> tClass) {
        T element = get(id,tClass);
      ;
        session.beginTransaction();
        session.delete(element);
        session.getTransaction().commit();
        return true;
    }
    public T get (int id,Class<T> tClass) {
        return session.get(tClass,id);
    }

    public List<T> get(Class<T> tClass){
        List<T> elements = session.createQuery("SELECT p FROM " + tClass.getSimpleName() + " p").getResultList();
        return elements;
    }

}

package org.example.dao;

import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDao extends BaseDAO2<Product> {
    public ProductDao() {
        super(SessionFactorySingleton.getSessionFactory(), Product.class);
    }

    @Override
    public List<Product> get() {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select p from Product p", Product.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }

    }

    public List<Product> getProductSup (double sup){
        session = sessionFactory.openSession();
        TypedQuery<Product> query = session.createQuery("select p from Product p where p.price > :sup", Product.class);
        query.setParameter("sup",sup);

        return query.getResultList();

    }
    public List<Product> getBetweenDate (LocalDate date, LocalDate date2){
        session = sessionFactory.openSession();
        TypedQuery<Product> query = session.createQuery("select p from Product p where p.purchasedate between :date and :date2", Product.class);
        query.setParameter("date",date);
        query.setParameter("date2",date2);
        return query.getResultList();
    }
}

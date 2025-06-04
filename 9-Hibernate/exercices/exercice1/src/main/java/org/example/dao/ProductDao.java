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
            System.out.println(session);
            return session.createQuery("select p from Product p", Product.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }

    }

    public List<Product> getAllProductOverThePrice (double price){
        try{
            session = sessionFactory.openSession();
            TypedQuery<Product> query = session.createQuery("select p from Product p where p.price >= :price", Product.class);
            query.setParameter("price",price);
            return query.getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public List<Product> getAllProductBetween2Date (LocalDate start , LocalDate end){
        try{
            session = sessionFactory.openSession();
            TypedQuery<Product> query = session.createQuery("select p from Product p where p.purchasedate between :start and :end", Product.class);
            query.setParameter("start",start);
            query.setParameter("end",end);
            return query.getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public List<Product> getIdAndRefByStock (int stock){
        try{
            session = sessionFactory.openSession();
            TypedQuery<Product> query = session.createQuery("select p from Product p where p.stock >= :stock", Product.class);
            query.setParameter("stock",stock);
            return query.getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public List<Product> getAllProductByBrand (String brand){
        try{
            session = sessionFactory.openSession();
            TypedQuery<Product> query = session.createQuery("select p from Product p where p.brand = :brand", Product.class);
            query.setParameter("brand",brand);
            return query.getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public List<Product> avgPrice(){
        try{
            session = sessionFactory.openSession();
            TypedQuery<Product> query = session.createQuery("select avg(p.price) from Product p", Product.class);
            return query.getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public void deleteProductByBrand(String brand){
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            TypedQuery<Product> query = session.createQuery("delete from Product p where p.brand = :brand", Product.class);
            query.setParameter("brand",brand);
            query.executeUpdate();
            session.getTransaction().commit();
        }catch (Exception ex){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    public List<Product> getProductToAvg(double note) {
        try{
            System.out.println(note);
            session = sessionFactory.openSession();
            TypedQuery<Product> query = session.createQuery("select p from Product p JOIN p.comments c group by p.id having avg(c.note) >= :note", Product.class);
            query.setParameter("note",note);
            System.out.println("tets");
            System.out.println(query.getResultList());
            List<Product> products = query.getResultList();
            return products;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return new ArrayList<>();
        }finally {
            session.close();
        }

    }
}

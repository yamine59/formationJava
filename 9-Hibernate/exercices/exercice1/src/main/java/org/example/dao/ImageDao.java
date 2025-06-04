package org.example.dao;

import org.example.entity.Image;
import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;

import java.util.ArrayList;
import java.util.List;

public class ImageDao extends BaseDAO2<Image>{
    public ImageDao() {
        super(SessionFactorySingleton.getSessionFactory(), Image.class);
    }

    @Override
    public List<Image> get() {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select i from Image i", Image.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }

    }

    public List<Image> getImageByProduct(int id) {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select i from Image i where i.product.id = :id", Image.class).setParameter("id",id).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }

    }


}

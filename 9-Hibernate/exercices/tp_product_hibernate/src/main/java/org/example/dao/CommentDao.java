package org.example.dao;

import org.example.entity.Comment;
import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class CommentDao extends BaseDAO2<Comment>{
    public CommentDao() {
        super(SessionFactorySingleton.getSessionFactory(), Comment.class);
    }

    @Override
    public List<Comment> get() {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select p from Comment p", Comment.class).getResultList();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return new ArrayList<>();
        }finally {
            session.close();
        }

    }

    public List<Comment> getCommentByProduct(int id) {
        try{
            session = sessionFactory.openSession();
            TypedQuery<Comment> query = session.createQuery("select p from Comment p where p.product.id = :id", Comment.class);
            query.setParameter("id",id);
            return query.getResultList();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return new ArrayList<>();
        }finally {
            session.close();
        }

    }


}

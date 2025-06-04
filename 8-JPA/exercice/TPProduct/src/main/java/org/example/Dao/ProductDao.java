package org.example.Dao;

import org.example.entity.Product;

import java.util.List;

public class ProductDao extends BaseDao<Product>{
    public List<Product> getAllProducts() {
        List<Product> products = em.createQuery("SELECT p FROM Product p").getResultList();
        return products;
    }

    public List<Product> getProductsByType(String type) {
        List<Product> products = em.createNativeQuery("SELECT * FROM Product where DTYPE  = ?", Product.class).setParameter(1, type).getResultList();
        return products;
    }


}

package org.example.service;

import org.example.Dao.ProductDao;
import org.example.entity.Product;

import java.util.List;

public class ProductService {
    ProductDao productDao = new ProductDao();
    public void addProduct(Product product) {
        productDao.save(product);
    }
    public void updateProduct(Product product) {
        productDao.update(product);
    }
    public void removeProduct(int id) {
        productDao.remove(id,Product.class);
    }
    public Product getProduct(int id) {
        return productDao.getById(id,Product.class);
    }
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();

    }
    public List<Product> getProductsByType(String type) {
        return productDao.getProductsByType(type);
    }
}

package org.example.service;

import org.example.dao.ProductDao;
import org.example.entity.Product;

import java.time.LocalDate;
import java.util.List;

public class ProductService {
    public Product save(String brand, String reference, LocalDate purchasedate, double price, int stock) {
        Product product = Product.builder().brand(brand).reference(reference).purchasedate(purchasedate).price(price).stock(stock).build();
        return new ProductDao().save(product);
    }
    public void update(Product product) {
        new ProductDao().save(product);
    }
    public Product get(int id) {
        return new ProductDao().get(id);
    }
    public List<Product> getAll() {
        return new ProductDao().get();
    }
    public boolean delete(int id) {
        return new ProductDao().delete(id);
    }
}

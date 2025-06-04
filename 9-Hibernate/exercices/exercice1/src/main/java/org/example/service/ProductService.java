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
    public List<Product> getAllProductByBrand (String brand){
        return new ProductDao().getAllProductByBrand(brand);
    }
    public List<Product> getAllProductOverThePrice (double price){
        return new ProductDao().getAllProductOverThePrice(price);
    }
    public List<Product> getAllProductBetween2Date(LocalDate start , LocalDate end){
        return new ProductDao().getAllProductBetween2Date(start , end);
    }
    public List<Product> getAllProductByStock (int stock){
        return new ProductDao().getAllProductByStock(stock);
    }
    public List<Product> avgPrice(){
        return new ProductDao().avgPrice();
    }
    public void deleteProductByBrand(String brand){
        new ProductDao().deleteProductByBrand(brand);
    }
}

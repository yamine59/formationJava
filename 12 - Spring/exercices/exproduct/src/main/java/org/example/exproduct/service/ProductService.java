package org.example.exproduct.service;

import org.example.exproduct.model.Product;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductService {
    private final Map<UUID, Product> products;

    public ProductService() {
        products = new HashMap<>();
        Product product1 = Product.builder()
                .uuid(UUID.randomUUID())
                .name("switch")
                .category("electronic")
                .price(350)
                .build();
        Product product2 = Product.builder()
                .uuid(UUID.randomUUID())
                .name("playstation 5")
                .category("electronic")
                .price(500)
                .build();
        Product product3 = Product.builder()
                .uuid(UUID.randomUUID())
                .name("chemise")
                .category("vestments")
                .price(20)
                .build();

        this.products.put(product1.getUuid(),product1);
        this.products.put(product2.getUuid(),product2);
        this.products.put(product3.getUuid(),product3);
    }

    public List<Product> getAllProduct(){
        return products.values().stream().toList();
    }

    public Product getProductById(UUID id){
        return products.get(id);
    }

    public List<Product> getProductByCategoryAndPrice(String category, double maxPrice){
        return products.values().stream()
                .filter(c -> c.getCategory().equals(category) && c.getPrice() <= maxPrice)
                .toList();
    }

    public List<Product> getProductByCategory (String category){
        return products.values().stream()
                .filter(p -> p.getCategory().equals(category))
                .toList();
    }
}

package org.example.product.service;

import org.example.product.entity.Product;
import org.example.product.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product get(int id){
        return productRepo.findById(id).orElse(null);
    }
    public List<Product> get(){
        return productRepo.findAll().stream().toList();
    }

    public Product save (Product product){
        return productRepo.save(product);
    }

    public Product Update (int id ,Product product){
        return productRepo.findById(id).map(p->{
            p.setName(product.getName());
            p.setPrice(product.getPrice());
            return productRepo.save(p);
        }).orElse(null);

    }

    public void delete(int id){
        productRepo.deleteById(id);
    }
}

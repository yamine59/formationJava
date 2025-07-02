package org.example.product.controller;

import org.example.product.entity.Product;
import org.example.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll (){
        return service.get();
    }

    @GetMapping("/{id}")
    public Product get (@PathVariable int id){
        return service.get(id);
    }

    @PostMapping
    public Product save (@RequestBody Product product){
        return service.save(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Integer id, @RequestBody Product product){
        return service.Update(id,product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}

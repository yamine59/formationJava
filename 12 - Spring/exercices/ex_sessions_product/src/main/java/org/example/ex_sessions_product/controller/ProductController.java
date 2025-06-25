package org.example.ex_sessions_product.controller;

import org.example.ex_sessions_product.dto.ProductReceiveDto;
import org.example.ex_sessions_product.dto.ProductResponseDto;
import org.example.ex_sessions_product.entity.Product;
import org.example.ex_sessions_product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/product")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> getAllProducts() {
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDto> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<ProductResponseDto> createProduct(@RequestBody ProductReceiveDto productReceiveDto) {
        return ResponseEntity.ok(service.create(productReceiveDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponseDto> update(@PathVariable long id, @RequestBody ProductReceiveDto productReceiveDto) {
        return ResponseEntity.ok(service.update(id, productReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        service.delete(id);
        return ResponseEntity.ok("Product at id : " + id + " is deleted");
    }

}

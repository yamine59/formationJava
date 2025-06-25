package org.example.ex_sessions_product.controller;

import jakarta.servlet.http.HttpSession;
import org.example.ex_sessions_product.dto.ProductResponseDto;
import org.example.ex_sessions_product.service.ProductService;
import org.example.ex_sessions_product.service.ProductSessionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductSessionController {

    private final ProductSessionService service;

    public ProductSessionController(ProductSessionService service) {
        this.service = service;
    }
    
    @GetMapping("/cart/{productId}")
    public ResponseEntity<String> addToCart(@PathVariable Long productId) {
        service.addToCart(productId);
        return ResponseEntity.ok("Product added to cart");
    }

    @DeleteMapping("/cart/{productId}")
    public ResponseEntity<String> deleteToCart(@PathVariable Long productId) {
        service.deleteToCart(productId);
        return ResponseEntity.ok("Product deleted to cart");
    }

    @GetMapping("/cart/totalPrice")
    public ResponseEntity<List<String>> totalPrice() {
        return ResponseEntity.ok(service.totalPrice());
    }

    @GetMapping("/cart")
    public ResponseEntity<List<ProductResponseDto>> getCart() {
        return ResponseEntity.ok(service.getCart());
    }
}

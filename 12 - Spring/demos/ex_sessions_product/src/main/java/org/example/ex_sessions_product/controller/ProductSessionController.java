package org.example.ex_sessions_product.controller;

import jakarta.servlet.http.HttpSession;
import org.example.ex_sessions_product.dto.ProductResponseDto;
import org.example.ex_sessions_product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductSessionController {

    private ProductService service;

    private HttpSession httpSession;

    public ProductSessionController(ProductService service, HttpSession httpSession) {
        this.service = service;
        this.httpSession = httpSession;
    }

    @GetMapping("/cart/{productId}")
    public ResponseEntity<String> addToCart(@PathVariable Long productId) {
        List<Long> cart = (List<Long>) httpSession.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
        }

        cart.add(service.get(productId).getId());
        httpSession.setAttribute("cart", cart);
        return ResponseEntity.ok("Product added to cart");
    }

    @DeleteMapping("/cart/{productId}")
    public ResponseEntity<String> deleteToCart(@PathVariable Long productId) {
        List<Long> cart = (List<Long>) httpSession.getAttribute("cart");

        cart.remove(service.get(productId).getId());
        httpSession.setAttribute("cart", cart);
        return ResponseEntity.ok("Product deleted to cart");
    }

    @GetMapping("/cart/totalPrice")
    public ResponseEntity<List<String>> totalPrice() {
        List<Long> cart = (List<Long>) httpSession.getAttribute("cart");
        double totalPrice = 0;
        List<String> Listproduct = new ArrayList<>();

        if (cart != null) {
            for (Long id : cart) {
                Listproduct.add("Product name is : "+service.get(id).getName() + ", price is : "+service.get(id).getPrice());
            }
        }

        if (cart != null) {
            for (Long id : cart) {
                totalPrice+= service.get(id).getPrice();
            }
        }

        Listproduct.add("totalPrice is : "+totalPrice);

        httpSession.setAttribute("cart", cart);
        return ResponseEntity.ok(Listproduct);
    }

    @GetMapping("/cart")
    public ResponseEntity<List<ProductResponseDto>> getCart() {
        List<Long> cart = (List<Long>) httpSession.getAttribute("cart");
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();

        if (cart != null) {
            for (Long id : cart) {
                productResponseDtos.add(service.get(id));
            }
        }else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ArrayList<>());
        }
        return ResponseEntity.ok(productResponseDtos);
    }
}

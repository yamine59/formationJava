package org.example.ex_sessions_product.service;

import jakarta.servlet.http.HttpSession;
import org.example.ex_sessions_product.dto.ProductReceiveDto;
import org.example.ex_sessions_product.dto.ProductResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductSessionService {

    private ProductService service;

    private HttpSession httpSession;

    public ProductSessionService(ProductService service, HttpSession httpSession) {
        this.service = service;
        this.httpSession = httpSession;
    }

    public void addToCart (Long productId) {
        List<Long> cart = (List<Long>) httpSession.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
        }

        cart.add(service.get(productId).getId());
        httpSession.setAttribute("cart", cart);
    }

    public void deleteToCart (Long productId) {
        List<Long> cart = (List<Long>) httpSession.getAttribute("cart");
        cart.remove(service.get(productId).getId());
        httpSession.setAttribute("cart", cart);
    }

    public List<String> totalPrice () {
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
        return Listproduct;
    }

    public List<ProductResponseDto> getCart () {
        List<Long> cart = (List<Long>) httpSession.getAttribute("cart");
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();
        if (cart != null) {
            for (Long id : cart) {
                productResponseDtos.add(service.get(id));
            }
        }else {
            return new ArrayList<>();
        }
        return productResponseDtos;
    }
}

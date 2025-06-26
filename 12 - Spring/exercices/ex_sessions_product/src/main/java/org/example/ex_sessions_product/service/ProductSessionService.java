package org.example.ex_sessions_product.service;

import jakarta.servlet.http.HttpSession;
import org.example.ex_sessions_product.dto.ProductReceiveDto;
import org.example.ex_sessions_product.dto.ProductResponseDto;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductSessionService {

    private final ProductService service;
    private final HttpSession httpSession;

    public ProductSessionService(ProductService service, HttpSession httpSession) {
        this.service = service;
        this.httpSession = httpSession;
    }

    public void addToCart(Long productId, int quantity) {
        Map<Long, Integer> cart = getCartMap();

        ProductResponseDto product = service.get(productId);
        if (product.getQuantity() < quantity) {
            throw new IllegalArgumentException("Not enough quantity in stock");
        }
        product.setQuantity(product.getQuantity() - quantity);
        service.create(toReceiveDto(product));

        cart.put(productId, cart.getOrDefault(productId, 0) + quantity);
        httpSession.setAttribute("cart", cart);
    }

    public void deleteToCart(Long productId) {
        Map<Long, Integer> cart = getCartMap();

        if (cart.containsKey(productId)) {
            int quantityInCart = cart.get(productId);

            ProductResponseDto product = service.get(productId);
            product.setQuantity(product.getQuantity() + quantityInCart);
            service.create(toReceiveDto(product));

            cart.remove(productId);
            httpSession.setAttribute("cart", cart);
        }
    }

    public List<String> totalPrice() {
        Map<Long, Integer> cart = getCartMap();
        double totalPrice = 0;
        List<String> productSummaries = new ArrayList<>();

        if (cart.isEmpty()) {
            productSummaries.add("Cart is empty.");
            return productSummaries;
        }

        for (Map.Entry<Long, Integer> entry : cart.entrySet()) {
            ProductResponseDto product = service.get(entry.getKey());
            int quantity = entry.getValue();
            double price = product.getPrice();
            double lineTotal = price * quantity;

            productSummaries.add(String.format(
                    "Product name: %s, unit price: %.2f, quantity: %d, total: %.2f",
                    product.getName(), price, quantity, lineTotal
            ));

            totalPrice += lineTotal;
        }

        productSummaries.add("Total cart price: " + totalPrice);
        return productSummaries;
    }

    public List<ProductResponseDto> getCart() {
        Map<Long, Integer> cart = getCartMap();
        List<ProductResponseDto> result = new ArrayList<>();

        for (Map.Entry<Long, Integer> entry : cart.entrySet()) {
            ProductResponseDto product = service.get(entry.getKey());

            result.add(ProductResponseDto.builder()
                    .id(product.getId())
                    .name(product.getName())
                    .price(product.getPrice())
                    .quantity(entry.getValue()) // quantité du panier
                    .build());
        }

        return result;
    }

    // Méthode utilitaire : conversion vers ProductReceiveDto
    private ProductReceiveDto toReceiveDto(ProductResponseDto dto) {
        ProductReceiveDto receiveDto = new ProductReceiveDto();
        receiveDto.setId(dto.getId());
        receiveDto.setName(dto.getName());
        receiveDto.setPrice(dto.getPrice());
        receiveDto.setQuantity(dto.getQuantity());
        return receiveDto;
    }

    // Méthode utilitaire : récupération du panier ou création si null
    private Map<Long, Integer> getCartMap() {
        Map<Long, Integer> cart = (Map<Long, Integer>) httpSession.getAttribute("cart");
        if (cart == null) {
            cart = new HashMap<>();
            httpSession.setAttribute("cart", cart);
        }
        return cart;
    }
}

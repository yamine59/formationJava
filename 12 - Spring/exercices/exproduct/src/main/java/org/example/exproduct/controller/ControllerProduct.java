package org.example.exproduct.controller;

import org.example.exproduct.model.Product;
import org.example.exproduct.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class ControllerProduct {
    private final ProductService productService;

    public ControllerProduct(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String homePage(Model model){
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products",products);
        return "product_list";
    }

    @GetMapping("/product/{id}")
    public String detaiPage(@PathVariable("id")UUID id ,Model model){
        Product product = productService.getProductById(id);
        model.addAttribute("product",product);
        return "product_detail";
    }

    @GetMapping("/product/filter")
    public String filterPage(@RequestParam(value = "category", required = false) String category, @RequestParam(value = "price", required = false)double price , Model model ) {
        List<Product> productsfilted = productService.getProductByCategoryAndPrice(category,price);
        model.addAttribute("products_filter", productsfilted);
        return "product_filter";
    }

    @GetMapping("/product/category")
    public String CategoryPage(@RequestParam(value = "category", required = false)String category , Model model){
        List<Product> productsfilted = productService.getProductByCategory(category);
        model.addAttribute("products", productsfilted);
        return "product_list";
    }
}

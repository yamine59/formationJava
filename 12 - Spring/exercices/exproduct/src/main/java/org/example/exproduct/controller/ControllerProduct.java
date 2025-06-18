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
        model.addAttribute("products",productService.getAllProduct());
        return "product_list";
    }

    @GetMapping("/product/{id}")
    public String detaiPage(@PathVariable("id")UUID id ,Model model){
        model.addAttribute("product",productService.getProductById(id));
        return "product_detail";
    }

    @GetMapping("/product/filter")
    public String filterPage(
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "price", required = false)double price ,
            Model model ) {
        model.addAttribute("products",productService.getProductByCategoryAndPrice(category,price));
        return "product_list";
    }

    @GetMapping("/product/category")
    public String CategoryPage(@RequestParam(value = "category", required = false)String category , Model model){
        model.addAttribute("products", productService.getProductByCategory(category));
        return "product_list";
    }
}

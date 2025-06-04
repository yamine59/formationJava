package org.example.controller;

import org.example.service.ProductService;

import java.time.LocalDate;
import java.util.Scanner;

public class AddProduct {
    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();

    public void start() {
        System.out.println("Ajouter un produit : ");
        System.out.println("Brand : ");
        String brand = scanner.nextLine();
        System.out.println("Reference : ");
        String reference = scanner.nextLine();
        System.out.println("Price : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Stock : ");
        int stock = scanner.nextInt();
        scanner.nextLine();
        productService.save(brand,reference, LocalDate.now(),price,stock);

    }
}

package org.example.controller;

import org.example.service.ProductService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GetProduct {

    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();
    public void getProduct() {
        System.out.println("Afficher un produit : ");
        System.out.println("entrez l'id du produit a afficher: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(productService.get(id));
    }

    public void getAllProduct() {
        productService.getAll().forEach(System.out::println);
    }

    public void getAllProductBetween2Date() {
        System.out.println("Entrer la date de debut : ");
        LocalDate start = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Entrer la date de fin : ");
        LocalDate end = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        productService.getAllProductBetween2Date(start,end).forEach(System.out::println);
    }

    public void getAllProductOverThePrice() {
        System.out.println("Entrer le prix : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        productService.getAllProductOverThePrice(price).forEach(System.out::println);
    }

    public void getAllProductByBrand() {
        System.out.println("Entrer la marque : ");
        String brand = scanner.nextLine();
        productService.getAllProductByBrand(brand).forEach(System.out::println);
    }

    public void getAllProductByStock() {
        System.out.println("Entrer le stock : ");
        int stock = scanner.nextInt();
        scanner.nextLine();
        productService.getAllProductByStock(stock).forEach(System.out::println);
    }

    public void avgPrice() {
        System.out.println(productService.avgPrice());
    }
}

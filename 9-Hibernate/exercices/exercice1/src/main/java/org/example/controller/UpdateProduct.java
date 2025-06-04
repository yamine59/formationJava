package org.example.controller;

import org.example.entity.Product;
import org.example.service.ProductService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UpdateProduct {
    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();
    public void start() {
        System.out.println("Modifier un produit : ");
        System.out.println("entrez l'id du produit a modifier: ");
        int id = scanner.nextInt();
        Product product = productService.get(id);
        scanner.nextLine();

        System.out.println("vous voulez modifier la marque (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer la marque : ");
            product.setBrand(scanner.nextLine());
        }
        System.out.println("vous voulez modifier la reference (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer la reference : ");
            product.setReference(scanner.nextLine());
        }
        System.out.println("vous voulez modifier le prix (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer le prix : ");
            product.setPrice(scanner.nextDouble());
            scanner.nextLine();
        }
        System.out.println("vous voulez modifier le stock (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer le stock : ");
            product.setStock(scanner.nextInt());
            scanner.nextLine();
        }
        System.out.println("vous voulez modifier la date d'achat  (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer la date : ");
            product.setPurchasedate(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        productService.update(product);
    }
}

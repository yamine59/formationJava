package org.example.controller;

import org.example.service.ProductService;

import java.util.Scanner;

public class DeleteProduct {
    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();
    public void start() {
        System.out.println("Supprimer un produit : ");
        System.out.println("entrez l'id du produit a supprimer: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        productService.delete(id);
    }
}

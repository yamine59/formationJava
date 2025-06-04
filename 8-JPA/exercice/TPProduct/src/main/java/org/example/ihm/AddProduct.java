package org.example.ihm;

import org.example.entity.Product_Electronic;
import org.example.entity.Product_Food;
import org.example.entity.Product_Housing;
import org.example.service.ProductService;

import java.util.Scanner;

public class AddProduct {
    private static Scanner scanner = new Scanner(System.in);

    private static ProductService productService = new ProductService();
    public static void start() {
        System.out.println("Ajouter un produit : ");
        System.out.println("[1] Ajouter un Product_food");
        System.out.println("[2] Ajouter un Product_housing");
        System.out.println("[3] Ajouter un Product_electronic");
        String choix = scanner.nextLine();
        switch (choix) {
            case "1":
                System.out.println("Nom du produit : ");
                String name = scanner.nextLine();
                System.out.println("Prix du produit : ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("la date d'expiration du produit : ");
                String expiryDate = scanner.nextLine();
                Product_Food product_food = Product_Food.builder().name(name).price(price).expiryDate(expiryDate).build();

                productService.addProduct(product_food);
                break;
            case "2":
                System.out.println("Nom du produit : ");
                String name2 = scanner.nextLine();
                System.out.println("Prix du produit : ");
                double price2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Hauteur du produit : ");
                String height = scanner.nextLine();
                System.out.println("Largeur du produit : ");
                String width = scanner.nextLine();
                Product_Housing product_housing = Product_Housing.builder().name(name2).price(price2).height(height).width(width).build();
                productService.addProduct(product_housing);
                break;
            case "3":
                System.out.println("Nom du produit : ");
                String name3 = scanner.nextLine();
                System.out.println("Prix du produit : ");
                double price3 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Duree de la batterie du produit : ");
                String batteryDuration = scanner.nextLine();
                Product_Electronic product_electronic = Product_Electronic.builder().name(name3).price(price3).batteryDuration(batteryDuration).build();
                productService.addProduct(product_electronic);
                break;
        }
    }

}

package org.example.controller;


import org.example.dao.ProductDao;
import org.example.entity.Product;
import org.example.service.ProductService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ihm {
    private Scanner scanner;

   private ProductService productService = new ProductService();

    public ihm() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    new AddProduct().start();
                    break;
                case "2":
                    new UpdateProduct().start();
                    break;
                case "3":
                    new DeleteProduct().start();
                    break;
                case "4":
                    new GetProduct().getProduct();
                    break;
                case "5":
                    new GetProduct().getAllProduct();
                    break;
                case "6":
                    new GetProduct().getAllProductByBrand();
                    break;
                case "7":
                    new GetProduct().getAllProductByStock();
                    break;
                case "8":
                    new GetProduct().getAllProductOverThePrice();
                    break;
                case "9":
                    new GetProduct().getAllProductBetween2Date();
                    break;
                case "10":
                    new GetProduct().avgPrice();
                    break;
                case "0":
                    System.out.println("Quitter");
                    break;
                default:

            }
        } while (!choix.equals("0"));
    }

    private void menu() {
        System.out.println("1 - Ajouter un produit ");
        System.out.println("2 - Modifier un produit ");
        System.out.println("3 - Supprimer un produit ");
        System.out.println("4 - Afficher un produit ");
        System.out.println("5 - Afficher tous les produits ");
        System.out.println("6 - Afficher tous les produits par marque ");
        System.out.println("7 - Afficher tous les produits par stock ");
        System.out.println("8 - Afficher tous les produits par prix ");
        System.out.println("9 - Afficher tous les produits par date ");
        System.out.println("10 - Afficher la moyenne des prix des produits ");
        System.out.println("0 - Quitter");

    }








}

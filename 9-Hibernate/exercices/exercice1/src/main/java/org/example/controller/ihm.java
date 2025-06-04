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
                    new GetProduct().start();
                    break;
                case "0":
                    System.out.println("Quitter");
                    break;
                default:

            }
        } while (!choix.equals("0"));
    }

    private void menu() {
        System.out.println("=============== MENU ===============");
        System.out.println("1 - Ajouter un produit ");
        System.out.println("2 - Modifier un produit ");
        System.out.println("3 - Supprimer un produit ");
        System.out.println("4 - Afficher les details d'un produit ");
        System.out.println("0 - Quitter");

    }








}

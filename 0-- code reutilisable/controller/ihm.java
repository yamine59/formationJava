package org.example.controller;


import java.util.Scanner;

public class ihm {
    private Scanner scanner;

//    private ProductService productService = new ProductService();

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
                    addProduct();
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
        System.out.println("0 - Quitter");

    }

    private void addProduct() {
        System.out.println("Ajouter un produit : ");

    }

}

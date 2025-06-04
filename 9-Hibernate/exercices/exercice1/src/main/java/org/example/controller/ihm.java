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
                    addProduct();
                    break;
                case "2":
                    updateProduct();
                    break;
                case "3":
                    deleteProduct();
                    break;
                case "4":
                    getProduct();
                    break;
                case "5":
                    getAllProduct();
                    break;
                case "6":
                    getAllProductByBrand();
                    break;
                case "7":
                    getAllProductByStock();
                    break;
                case "8":
                    getAllProductOverThePrice();
                    break;
                case "9":
                    getAllProductBetween2Date();
                    break;
                case "10":
                    avgPrice();
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

    private void addProduct() {
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

    public void updateProduct() {
        System.out.println("Modifier un produit : ");
        System.out.println("entrez l'id du produit a modifier: ");
        int id = scanner.nextInt();
        Product product = productService.get(id);
        scanner.nextLine();

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
        product.setBrand(brand);
        product.setReference(reference);
        product.setPurchasedate(LocalDate.now());
        product.setPrice(price);
        product.setStock(stock);
        productService.update(product);
    }

    public void deleteProduct() {
        System.out.println("Supprimer un produit : ");
        System.out.println("entrez l'id du produit a supprimer: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        productService.delete(id);
    }

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

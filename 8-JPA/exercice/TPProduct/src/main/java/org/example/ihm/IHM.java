package org.example.ihm;


import org.example.entity.Product;
import org.example.entity.Product_Electronic;
import org.example.entity.Product_Food;
import org.example.entity.Product_Housing;
import org.example.service.ProductService;

import java.util.Scanner;

public class IHM {
    private Scanner scanner;

    private ProductService productService = new ProductService();
    AddProduct addProduct = new AddProduct();
    public IHM() {
        scanner = new Scanner(System.in);


    }

    public void start() {
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    AddProduct.start(); // j importe l ihm de addProduct
                    break;
                case "2":
                    updateProduct();
                    break;
                case "3":
                    getAllProducts();
                    break;
                case "4":
                    getProductsByType();
                    break;
                case "5":
                    removeproduct();
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
        System.out.println("2 - Modifier un produit");
        System.out.println("3 - Afficher toutes les produits");
        System.out.println("4 - Afficher les produits par type");
        System.out.println("5 - Supprimer un produit");
        System.out.println("0 - Quitter");

    }

    private void updateProduct() {
        System.out.println("Quel id de produit voulez-vous modifier? ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nom du produit : ");
        String name = scanner.nextLine();
        System.out.println("Prix du produit : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Product product = productService.getProduct(id);
        if (product instanceof Product_Food) {
            System.out.println("la date d'expiration du produit : ");
            String expiryDate = scanner.nextLine();
            product = Product_Food.builder().id(id).name(name).price(price).expiryDate(expiryDate).build();
        } else if (product instanceof Product_Housing) {
            System.out.println("Hauteur du produit : ");
            String height = scanner.nextLine();
            System.out.println("Largeur du produit : ");
            String width = scanner.nextLine();
            product = Product_Housing.builder().id(id).name(name).price(price).height(height).width(width).build();
        } else if (product instanceof Product_Electronic) {
            System.out.println("Duree de la batterie du produit : ");
            String batteryDuration = scanner.nextLine();
            product = Product_Electronic.builder().id(id).name(name).price(price).batteryDuration(batteryDuration).build();
        }
        productService.updateProduct(product);
    }

    private void getAllProducts() {

        productService.getAllProducts().forEach(System.out::println);

    }

    private void getProductsByType() {
        System.out.println("Quel type de produit voulez-vous afficher? [1] product_food/ [2] product_housing/ [3] product_electronic");
        String type = scanner.nextLine();
        if (type.equals("1")) {
            type = "Product_Food";
        } else if (type.equals("2")) {
            type = "Product_Housing";
        } else if (type.equals("3")) {
            type = "Product_Electronic";
        }
        productService.getProductsByType(type).forEach(System.out::println);
    }

    private void removeproduct() {
        System.out.println("Quel id de produit voulez-vous supprimer? ");
        int id = scanner.nextInt();
        productService.removeProduct(id);
    }

}

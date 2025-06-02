package org.example.ihm;


import net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer;
import org.example.Dao.BaseDao;
import org.example.Dao.ProductDao;
import org.example.entity.Product;
import org.example.entity.Product_Electronic;
import org.example.entity.Product_Food;
import org.example.entity.Product_Housing;
import org.example.service.ProductService;

import java.sql.SQLException;
import java.util.Scanner;

public class IHM {
    private Scanner scanner;

    private ProductService productService = new ProductService();

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
                    addProduct();
                    break;
                case "2":
                    getAllProducts();
                    break;
                case "3":
                    getProductsByType();
                    break;
                case "4":
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
        System.out.println("2 - Afficher toutes les produits");
        System.out.println("3 - Afficher les produits par type");
        System.out.println("4 - Supprimer un produit");
        System.out.println("0 - Quitter");

    }

    private void addProduct() {
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

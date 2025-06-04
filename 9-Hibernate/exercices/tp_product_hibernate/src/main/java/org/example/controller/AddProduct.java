package org.example.controller;

import org.example.service.ProductService;

import java.time.LocalDate;
import java.util.Scanner;

public class AddProduct {
    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();

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
                  addComment();
                  break;
              case "3":
                  addImage();
                  break;
              case "0":
                  System.out.println("Quitter");
                  break;
              default:
                  System.out.println("Choix incorrect");
          }
        } while (!choix.equals("0"));
    }

    public void menu() {
        System.out.println("1. Ajouter un produit");
        System.out.println("2. Ajouter un commentaire a un produit");
        System.out.println("3. Ajouter une image a un produit");
        System.out.println("0. Quitter");
    }

    public void addProduct() {
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

    public void addComment() {
        System.out.println("Ajouter un commentaire : ");
        System.out.println("Id du produit : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Note : ");
        int note = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Commentaire : ");
        String comment = scanner.nextLine();
        LocalDate date = LocalDate.now();

        productService.addCommentToProduct(id,comment,date,note);
    }

    public void addImage() {
        System.out.println("Ajouter une image : ");
        System.out.println("Id du produit : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Url : ");
        String url = scanner.nextLine();
        productService.addImageToProduct(id,url);
    }
}

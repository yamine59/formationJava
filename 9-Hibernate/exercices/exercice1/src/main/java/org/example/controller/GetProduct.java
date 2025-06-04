package org.example.controller;

import org.example.dao.CommentDao;
import org.example.dao.ImageDao;
import org.example.entity.Comment;
import org.example.entity.Image;
import org.example.entity.Product;
import org.example.service.ProductService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class GetProduct {

    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();
    ImageDao imageDao = new ImageDao();
    CommentDao commentDao = new CommentDao();

    public void start() {
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    getProduct();
                    break;
                case "2":
                    getAllProduct();
                    break;
                case "3":
                    getAllProductBetween2Date();
                    break;
                case "4":
                    getAllProductOverThePrice();
                    break;
                case "5":
                    getAllProductByBrand();
                    break;
                case "6":
                    getIdAndRefByStock();
                    break;
                case "7":
                    avgPrice();
                    break;

                case "0":
                    System.out.println("Quitter");
                    break;
                default:

            }
        } while (!choix.equals("0"));
    }

    public void menu() {
        System.out.println("=========== Details des produits ===========");
        System.out.println("1 - Afficher un produit ");
        System.out.println("2 - Afficher tous les produits ");
        System.out.println("3 - Afficher tous les produits par date ");
        System.out.println("4 - Afficher tous les produits par prix ");
        System.out.println("5 - Afficher tous les produits par marque ");
        System.out.println("6 - Afficher tous les produits par stock ");
        System.out.println("7 - Afficher la moyenne des prix des produits ");
        System.out.println("0 - Quitter");
    }


    public void getProduct() {
        System.out.println("Afficher un produit : ");
        System.out.println("entrez l'id du produit a afficher: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(productService.get(id));
        System.out.println("vous voulez afficher les image (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            List<Image> images = imageDao.getImageByProduct(id);
            if (images.isEmpty()) {
                System.out.println("Aucune image pour ce produit.");

            }
            images.forEach(System.out::println);
        }
        System.out.println("vous voulez afficher les commentaire (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            List<Comment> comments = commentDao.getCommentByProduct(id);
            if (comments.isEmpty()) {
                System.out.println("Aucun commentaire pour ce produit.");

            }
            comments.forEach(System.out::println);
        }

        Comment comment = commentDao.get(id);
        System.out.println(comment);
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

    public void getIdAndRefByStock() {
        System.out.println("Entrer le stock : ");
        int stock = scanner.nextInt();
        scanner.nextLine();
        productService.getIdAndRefByStock(stock).forEach(System.out::println);
    }

    public void avgPrice() {
        System.out.println(productService.avgPrice());
    }
}

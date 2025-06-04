package org.example.controller;

import org.example.dao.CommentDao;
import org.example.dao.ImageDao;
import org.example.entity.Comment;
import org.example.entity.Image;
import org.example.entity.Product;
import org.example.service.ProductService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UpdateProduct {
    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();
    CommentDao commentDao = new CommentDao();
    ImageDao imageDao = new ImageDao();
    public void start() {
        String choix;

        do {
            menu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    updateProduct();
                    break;
                case "2":
                    updateImage();
                    break;
                case "3":
                    updateComment();
                    break;
                case "0":
                    System.out.println("Quitter");
                    break;
                default:

            }
        } while (!choix.equals("0"));
    }

    public void menu() {
        System.out.println("========== MENU ==========");
        System.out.println("1 - Modifier un produit ");
        System.out.println("2 - Modifier une image ");
        System.out.println("3 - Modifier un commentaire ");
        System.out.println("0 - Quitter");
    }

    public void updateProduct() {
        System.out.println("Modifier un produit : ");
        System.out.println("entrez l'id du produit a modifier: ");
        int id = scanner.nextInt();
        Product product = productService.get(id);
        scanner.nextLine();

        System.out.println("vous voulez modifier la marque (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer la marque : ");
            product.setBrand(scanner.nextLine());
        }
        System.out.println("vous voulez modifier la reference (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer la reference : ");
            product.setReference(scanner.nextLine());
        }
        System.out.println("vous voulez modifier le prix (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer le prix : ");
            product.setPrice(scanner.nextDouble());
            scanner.nextLine();
        }
        System.out.println("vous voulez modifier le stock (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer le stock : ");
            product.setStock(scanner.nextInt());
            scanner.nextLine();
        }
        System.out.println("vous voulez modifier la date d'achat  (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer la date : ");
            product.setPurchasedate(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        productService.update(product);


    }

    public void updateImage() {
        System.out.println("Modifier une image : ");
        System.out.println("entrez l'id du produit a modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Image image = imageDao.get(id);

            System.out.println("Entrer l'url : ");
            image.setUrl(scanner.nextLine());

        imageDao.save(image);
    }

    public void updateComment() {
        System.out.println("Modifier un commentaire : ");
        System.out.println("entrez l'id du produit a modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Comment comment = commentDao.get(id);
        System.out.println("Vous voulez modifier le commentaire (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer le commentaire : ");
            comment.setContent(scanner.nextLine());
        }
        System.out.println("Vous voulez modifier la date (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer la date : ");
            LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            comment.setDate(date);
        }
        System.out.println("Vous voulez modifier la note (y/n) : ");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Entrer la note : ");
            int note = scanner.nextInt();
            scanner.nextLine();
            comment.setNote(note);
        }
        commentDao.save(comment);


    }



}
package org.example.ihm;

import org.example.service.CustomerService;

import java.util.Scanner;

public class ConsoleIhm {
    private static CustomerService clientService = new CustomerService();

    private static Scanner scanner = new Scanner(System.in);

    public static void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Créer utilisateur");
            System.out.println("2. Depot d'argent");
            System.out.println("3. retrait d'argent");
            System.out.println("4. voir d'argent");

            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    depot();
                    break;
                case 3:
                    retrait();
                    break;
                case 4:
                    watchAccount();
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Au revoir !");
    }

    private static void createUser() {
        System.out.print("Nom  : ");
        String firstName = scanner.nextLine();
        System.out.print("Prenom : ");
        String lastName = scanner.nextLine();
        System.out.print("telephone : ");
        String phone = scanner.nextLine();

        clientService.createClient(lastName,firstName,phone);
    }

    private static void watchAccount(){
        System.out.println("Entrer l'id du client");
        int idClient = scanner.nextInt();

        clientService.watch(idClient);
    }

    private static void depot(){
        System.out.println("Entrer l'id du client");
        int idClient = scanner.nextInt();
        System.out.println("Entrer le montant a depose");
        double depot = scanner.nextInt();
        clientService.depot(idClient,depot);
    }
    private static void retrait(){
        System.out.println("Entrer l'id du client");
        int idClient = scanner.nextInt();
        System.out.println("Entrer le montant a depose");
        double depot = scanner.nextInt();
        clientService.retrait(idClient,depot);
    }
}

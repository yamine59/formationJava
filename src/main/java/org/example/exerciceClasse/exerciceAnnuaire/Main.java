package org.example.exerciceClasse.exerciceAnnuaire;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Entreprise entreprise1 = new Entreprise("entreprise1",1234,"20 rue des ecole");
        Entreprise entreprise2 = new Entreprise("entreprise2",1234,"20 rue des ecole");

        AnnuaireEntreprise annuaireEntreprise = new AnnuaireEntreprise();
        annuaireEntreprise.montrerEntreprise();

        annuaireEntreprise.ajouterEntreprise("entreprise2",1234,"20 rue des ecole","ee");



        int choixMenu = 0;
        String nom = "";
        int nsiret = 0;
        String adresse = "";
        String siteWeb = "";

        Scanner scanner = new Scanner(System.in);

        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("""
          * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
          *                     Menu :                                    *
          *        1- Ajouter une entreprise                              *
          *        2- Afficher toutes les nom entreprises                 *
          *        3- Afficher les details de toutes les entreprise       *
          *        4- Afficher les details d'une entreprise               *
          *        0- Quitter                                             *
          *        Votre choix :                                          *
          * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

                   """);

            try {
                choixMenu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
                continue; // Skip the rest of the loop iteration and prompt again
            }
            scanner.nextLine();


            if (choixMenu == 1){
                System.out.println("Entrer le nom de l'entreprise");
                nom = scanner.nextLine();

                System.out.println("Entrer le numéro de siret");
                nsiret = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Entrer l'adresse de l'entreprise");
                adresse = scanner.nextLine();

                System.out.println("Entrer le site web de l'entreprise");
                siteWeb = scanner.nextLine();

            }
            if (choixMenu == 4){
                System.out.println("Entreprise dans l'annuaire : ");
                annuaireEntreprise.montrerEntrepriseNom();
                System.out.println("saisir le nom de l'entreprise a afficher : ");


                nom = scanner.nextLine();


            }
            switch (choixMenu){
                case 1-> annuaireEntreprise.ajouterEntreprise(nom,nsiret,adresse,siteWeb);
                case 2-> annuaireEntreprise.montrerEntrepriseNom();
                case 3-> annuaireEntreprise.montrerEntreprise();
                case 4-> annuaireEntreprise.montrerEntrepriseNom2(nom);
                case 0-> System.out.println("au revoir !!!");
                default->System.out.println("choix invalide !!!");
            }
        }while (choixMenu !=0);
    }
}

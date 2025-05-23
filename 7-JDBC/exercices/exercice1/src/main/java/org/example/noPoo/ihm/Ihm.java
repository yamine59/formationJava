package org.example.noPoo.ihm;

import org.example.noPoo.GestionStudentDB;

import java.util.Scanner;

public class Ihm {

    public void start(){
        Scanner scanner = new Scanner(System.in);
        GestionStudentDB gestionStudentDB = new GestionStudentDB();

        while (true){
            System.out.println("\n[1] Ajouter un etudiant");
            System.out.println("[2] Afficher la totalite des etudiant");
            System.out.println("[3] Afficher tous les classes");
            System.out.println("[4] Afficher les etudiant d'une classe");
            System.out.println("[5] Supprimer un etudiant");
            System.out.println("[0] Quitter");
            String input = scanner.nextLine();

            switch (input){
                case "1" ->gestionStudentDB.registerStudant();
                case "2" ->gestionStudentDB.showAllStudant();
                case "3" ->gestionStudentDB.showAllClass();
                case "4" ->gestionStudentDB.ClassStudant();
                case "5" ->gestionStudentDB.deleteStudant();
                default -> {
                    System.out.println("Au revoir");
                    return;
                }
            }
        }
    }


}

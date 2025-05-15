package org.example.exerciceBase.demos;

import java.util.Scanner;

public class Exemple2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nom,prenom,nom_complet;
        System.out.println("entrer votre nom");
        nom = scanner.nextLine();
        System.out.println("entrer votre prenom");
        prenom = scanner.nextLine();
        nom_complet = nom +" "+ prenom ;
        System.out.println("Votre nom complete est " + nom_complet);

    }
}

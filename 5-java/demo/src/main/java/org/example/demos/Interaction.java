package org.example.demos;

import java.util.Scanner;

public class Interaction {
    public static void main(String[] args) {
        /*

        //affichage
        // differents print (println, print, printf)
        System.out.println("bonjour");
        System.out.println("a tous");

        //print
        System.out.print("a tous");


        int age = 25;
        double poids = 70;
        String nom = "john doe";
        System.out.println();
        System.out.printf("Nom : %s , Age : %d ; Poids : %.2f", nom,age,poids);
        System.out.println();

        // \n saut de ligne
        // \t fait un tab

        */

        // l objet scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est votre prenom ?");
        String nomUtilisateur = scanner.nextLine();
        System.out.println("bonjour " + nomUtilisateur);

        System.out.println("Quelle est votre age ?");
        int age = scanner.nextInt();
        System.out.println("Vous avez " + age + " ans.");



    }
}

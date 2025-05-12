package org.example;

import java.util.Scanner;

public class Exercice56 {
    public static void main(String[] args) {
        /*
        1. Saisir une chaine et la stocker dans une variable
        2. Effectuer les traitements suivants :
            1. Afficher la chaîne en minuscule
            2. Afficher la chaîne en majuscule
        3. Bonus
        1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
        2. Afficher la première lettre de chaque mot en majuscule
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir une chaines");
        String chaine = scanner.nextLine();
        System.out.println(chaine.toUpperCase());
        System.out.println(chaine.toLowerCase());

    }
}

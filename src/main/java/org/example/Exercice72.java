package org.example;

import java.util.Scanner;

public class Exercice72 {
    public static void main(String[] args) {
        /*
        1. Créer une variable jour de type entier
        2. Affecter une valeur à la variable jour
        3. Afficher le jour de la semaine en lettre en fonction du nombre
            passé
        4. Si le nombre est inférieur à 1 et supérieur à 7, afficher un message
            d'erreur
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un jour de la semaine : ");
        int jour = scanner.nextInt();

        switch (jour){
            case 1 -> System.out.println("lundi");
            case 2 -> System.out.println("mardi");
            case 3 -> System.out.println("mercredi");
            case 4 -> System.out.println("jeudi");
            case 5 -> System.out.println("vendredi");
            case 6 -> System.out.println("samedi");
            case 7 -> System.out.println("dimanche");
            default -> System.out.println("entrer un chiffre entre 1 et 7 ");
        }

    }
}

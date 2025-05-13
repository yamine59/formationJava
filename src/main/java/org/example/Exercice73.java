package org.example;

import java.util.Scanner;

public class Exercice73 {
    public static void main(String[] args) {
        /*
        1. Créer une variable mois de type entier
        2. Affecter une valeur à la variable mois
        3. Afficher le nombre de jours du mois
        4. Si le nombre est inférieur à 1 et supérieur à 12, afficher un
            message d'erreur
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un numéro de mois : ");
        int mois = scanner.nextInt();

        switch (mois){
            case 1,3,5,7,8,10,12 -> System.out.println("31 jours");
            case 2 -> System.out.println("28 ou 29 jours");
            case 4,6,9,11 -> System.out.println("30 jours");
            default -> System.out.println("entrer un chiffre entre 1 et 12 ");
        }



    }
}

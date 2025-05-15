package org.example.exerciceBase;

import java.util.Scanner;

public class Exercice78 {
    public static void main(String[] args) {
        /*
        1. Écrire un programme qui affiche les nombres de 1 à 10 à l'aide
            d'une boucle
        2. Afficher la valeur à chaque itération

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un chiffre");
        int f = scanner.nextInt();
        String message = "";
        for (int i = 1; i < f+1; i++) {
            message = message + i + " ";
            System.out.println(message);
        }
    }
}

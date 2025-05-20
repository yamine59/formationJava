package org.example.exercices;

import java.util.Scanner;

public class Exercice17Bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("veillez saisir un chiffre");
        int nbr = scanner.nextInt();
        String message = "";
        for (int i = 1; i < nbr +1; i++) {
            message = message + i+ " ";
            System.out.println(message);
            System.out.println(message);




        }
    }
}

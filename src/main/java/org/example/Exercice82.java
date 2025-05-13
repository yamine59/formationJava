package org.example;

import java.util.Scanner;

public class Exercice82 {
    public static void main(String[] args) {
        /*
        1. Déclarer une variable nombre
        2. À l'aide de boucles, afficher les suites de nombres qui permettent
            d'arriver au nombre inscrit précédemment
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre");
        int n = scanner.nextInt();
        int somme = 0;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            somme = 0;
            for (int j = i; somme <= n;j++) {

                somme += j;
                total = j;
                System.out.println(j+"+");



            }
            System.out.println( " = "+somme);
            System.out.println();

        }
    }
}

package org.example.exerciceBase;

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
        String a = "" ;

        for (int i = 1; i <= n/2+1; i++) {
            somme = 0;
            a = "";
            for (int j = i; somme < n;j++) {
                if (!a.isEmpty()) {
                    a += " + ";
                }
                somme += j;
                a += j;
            }
            if (somme == n){
                System.out.println( somme + " = "+a);
                System.out.println();
            }
        }
    }
}

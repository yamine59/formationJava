package org.example.exerciceBase.exercices;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        System.out.println("Entrez le nombre de photocopies à faire :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double prixTotal;
        double prixUnitaire;

        if (a < 10) {
            prixUnitaire = 0.5;
        } else if (a < 20) {
            prixUnitaire = 0.4;
        } else {
            prixUnitaire = 0.3;
        }

        prixTotal = a * prixUnitaire;

        System.out.printf("Chaque copie vous coûtera %.2f euros et vous coûtera %.2f euros au total.\n", prixUnitaire, prixTotal);
    }
}
package org.example.exercices;

import java.util.Scanner;

public class Exercice18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre 1");
        double le1 = scanner.nextDouble();

        System.out.println("Nombre 2");
        double le2 = scanner.nextDouble();

        double leNombreGrand = nombreMax(le1, le2);

        System.out.println("Votre plus grand nombre est " + leNombreGrand);
    }

    public static double nombreMax(double nbr1, double nbr2) {
        double nbrMax;
        if (nbr1 > nbr2) {
            nbrMax = nbr1;
        } else {
            nbrMax = nbr2;
        }
        return nbrMax;
    }

    public static double nombreMaxV2(double nbr1, double nbr2) {
        if (nbr1 > nbr2) {
            return nbr1;
        }
        return nbr2;
    }
}
package org.example;

import java.util.Scanner;

public class exercice55 {
    public static void main(String[] args) {
        /*
        1. Créer un programme qui permet de calculer le volume d'un cône
        2. La formule est la suivante : 1/3 × π × r² × h
         */

        Scanner scanner = new Scanner(System.in);
        int r,h;
        double resultat;
        System.out.println("entrer le rayon ");
        r = scanner.nextInt();
        System.out.println("entrer la hauteur ");
        h = scanner.nextInt();

        resultat = 1.0/3*3.14*r*r*h;
        System.out.println("le volume du cone est : "+resultat);

    }
}

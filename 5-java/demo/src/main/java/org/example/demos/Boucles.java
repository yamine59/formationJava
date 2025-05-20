package org.example.demos;

import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {
        // Tant que
        // while

        int compteur = 1;

//        while (compteur < 11){
//            System.out.println("Compteur est égal à : "+compteur);
//            compteur++;
//        }

        // creation d'une boucle infinie
        Scanner scanner = new Scanner(System.in);
        int nbr = 0;

//        while (true){
//            System.out.println("Saisir le resultat de 2 + 1 pour sortir de la boucle :");
//            nbr = scanner.nextInt();
//            if (nbr == 3){
//                System.out.println("Bravo");
//                break;
//            }
//        }

//        int som,i;
//        i = 0;
//        som = 0;
//        while (som <=100){
//            i = i +1;
//            som = som + i;
//            System.out.println("Somme est à : "+som);
//        }
//        System.out.println("La valeur cherchée est : "+i);


//        int som,i;
//        i = 1;
//        som = 0;
//        while (som <=100){
//            som = som + i;
//            i = i +1;
//            System.out.println("valeur de i "+i);
//            System.out.println("Somme est à : "+som);
//        }
//        System.out.println("La valeur cherchée est : "+i);

//        int partDePizza = 10;
//        int cpt = 0;
//
//        while (partDePizza > 0){
//           // partDePizza = partDePizza - 1;
//          //  partDePizza -= 1;
//            partDePizza -= 2;
//            cpt++;
//            System.out.println("Manger deux part de pizza "+cpt);
//        }
//
//        System.out.println("Plus de pizza dipo...");
//
//        int age = 5;
//        int compteur2 = 0;
//
//        while (age < 18){
//            age++;
//            compteur2++;
//            System.out.println("Une anne passe j'ai maintenant "+age+" ans");
//        }
//
//        System.out.println("je suis majeur apres "+compteur2+" annees");

        // Boucle for
        // suntaxe for (initialisation compteur; condition de sortie; pas)
//        for (int cpt = 1; cpt <= 10;cpt++){
//            System.out.println("compteur : "+cpt);
//        }

//        for (int cpt = 10; cpt > -6;cpt--){
//            System.out.println("compteur : "+cpt);
//        }

        // DO WHILE
//        int nombre = -10;
//
//        while (nombre > 0){
//            System.out.println("while classique");
//            System.out.println(nombre);
//            nombre--;
//        }
//
//        do {
//            System.out.println("do while");
//            System.out.println(nombre);
//            nombre--;
//        }while (nombre > 0);

        // break et continue
        for (int cpt = 0;cpt <11;cpt++){

            if (cpt == 3){
                continue;
            }

            if(cpt == 8){
                break;
            }
            System.out.println(cpt);
        }


    }
}

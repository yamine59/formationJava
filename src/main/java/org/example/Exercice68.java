package org.example;

import java.util.Scanner;

public class Exercice68 {
    public static void main(String[] args) {
        /*
        1. Créer une variable age
        2. Affecter une valeur à la variable age
        3. Créer une condition qui permet d'afficher si la personne est
            majeure ou mineure
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer votre age");
        int age = scanner.nextInt();

        if (age>18){
            System.out.println("vous etes majeur");
        }else {
            System.out.println("vous etes mineur");
        }

    }
}

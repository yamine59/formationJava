package org.example.exerciceBase;

import java.util.Scanner;

public class Exercice75 {
    public static void main(String[] args) {
        /*
        1. Créer une variable caractere
        2. Affecter une valeur à la variable caractere
        3. Afficher un message en fonction du type du caractère (lettre,
            nombre, ou caractère spécial)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un caractère : ");
        char c = scanner.next().charAt(0);
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' ){
            System.out.println("lettre");
        }else if (c >= '0' && c <= '9' ){
            System.out.println("chiffre");
        }else {
            System.out.println("caractère spécial");
        }


    }
}

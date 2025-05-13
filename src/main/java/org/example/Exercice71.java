package org.example;

import java.util.Scanner;

public class Exercice71 {
    public static void main(String[] args) {
        /*
        1. Créer une variable caractere
        2. Affecter une valeur à la variable caractere
        3. A l'aide des structures conditionnelles, déterminer si le caractère
            est une consonne ou une voyelle
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un caractère");
        char c = scanner.nextLine().charAt(0);

       switch (c) {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'y':
               System.out.println("c'est une voyelle");
               break;
           default:
               System.out.println("c'est une consonne");
       }
    }
}

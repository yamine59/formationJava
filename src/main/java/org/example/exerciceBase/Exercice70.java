package org.example.exerciceBase;

import java.util.Scanner;

public class Exercice70 {
    public static void main(String[] args) {
        /*
        1. Créer 3 variables : nombre1, nombre2, nombre3
        2. Affecter des valeurs aux variables
        3. Créer des structures conditionnelles permettant d'afficher le
            maximum parmis les 3 nombres créésprécédemment
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrer le premiere nombre");
        int nombre1 = scanner.nextInt();

        System.out.println("entrer le deuxieme nombre");
        int nombre2 = scanner.nextInt();

        System.out.println("entrer le troisieme nombre");
        int nombre3 = scanner.nextInt();

        if (nombre1>nombre2 && nombre1>nombre3 ){
            System.out.println("La valeur maximale est : " + nombre1);
        }else if (nombre2>nombre1 && nombre2>nombre3){
            System.out.println("La valeur maximale est : " + nombre2);
        }else {
            System.out.println("La valeur maximale est : " + nombre3);
        }
    }
}

package org.example.exerciceBase;

import java.util.Scanner;

public class Exercice53 {
    public static void main(String[] args) {
        /*
        1. Écrire un programme avec les variables suivantes : a, b
        2. Afficher la somme des carrés de ces deux nombres
         */
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir a");
        a = scanner.nextInt();
        System.out.println("saisir b");
        b = scanner.nextInt();
        a = a*a+b*b;


        System.out.println("la valeur au carre de a est : "+ a  );
    }
}

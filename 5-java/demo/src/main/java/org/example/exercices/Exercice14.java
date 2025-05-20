package org.example.exercices;

import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un entier positif :");
        int nbrEntre = scanner.nextInt();
        int somme = 0;

        for (int i = 1; i <= nbrEntre;i++){
            // somme = somme + i;
           // System.out.print(i+" + ");
            somme += i;
        }

        System.out.println("Somme des entier pour "+nbrEntre+" est égal à : "+somme);
    }
}

package org.example;

import java.util.Scanner;

public class Exercice57 {
    public static void main(String[] args) {
        /*
        1. Saisir la longueur du côté du carré et la stocker dans une variable
        2. Calculer l'aire et le périmètre du carré
         */
        Scanner scanner = new Scanner(System.in);
        int l,p,a;
        System.out.println("Saisir la longueur d'un côté ");
        l = scanner.nextInt();
        System.out.println("le perimetre du carre est "+ l*4);
        System.out.println("L'aire du carré est de " +l*l);
    }
}

package org.example.exerciceBase.exercice;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indiquez votre taille");
        double taille = scanner.nextDouble();
        System.out.println(taille + "cm");

        System.out.println("Indiquez votre poids");
        double poids = scanner.nextDouble();
        System.out.println(taille + "kg");

        if (taille >= 145 && taille <= 169 &&  poids >= 43 && poids <= 47) {
            System.out.println("Votre taille de vetement est de 1");
        } else if (taille >= 145 && taille <= 166 &&  poids >= 48 && poids <= 53) {
            System.out.println("Votre taille de vetement est de 1");
        } else if (taille >= 145 && taille <= 163 &&  poids >= 54 && poids <= 59) {
            System.out.println("Votre taille de vetement est de 1");
        } else if (taille >= 145 && taille <= 160 &&  poids >= 60 && poids <= 65) {
            System.out.println("Votre taille de vetement est de 1");
        } else if (taille >= 169 && taille <= 178 &&  poids >= 48 && poids <= 53) {
            System.out.println("Votre taille de vetement est de 2");
        } else if (taille >= 166 && taille <= 175 &&  poids >= 54 && poids <= 59) {
            System.out.println("Votre taille de vetement est de 2");
        } else if (taille >= 163 && taille <= 172 &&  poids >= 60 && poids <= 65) {
            System.out.println("Votre taille de vetement est de 2");
        } else if (taille >= 160 && taille <= 163 &&  poids >= 66 && poids <= 71) {
            System.out.println("Votre taille de vetement est de 2");
        } else if (taille >= 178 && taille <= 183 &&  poids >= 54 && poids <= 59) {
            System.out.println("Votre taille de vetement est de 3");
        } else if (taille >= 175 && taille <= 183 &&  poids >= 60 && poids <= 65) {
            System.out.println("Votre taille de vetement est de 3");
        } else if (taille >= 172 && taille <= 183 &&  poids >= 66 && poids <= 71) {
            System.out.println("Votre taille de vetement est de 3");
        } else if (taille >= 163 && taille <= 183 &&  poids >= 72 && poids <= 77) {
            System.out.println("Votre taille de vetement est de 3");
        }else {
            System.out.println("Pas votre taille");
        }
    }
}
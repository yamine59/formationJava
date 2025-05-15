package org.example.exerciceBase;

import java.util.Scanner;

public class Exercice77 {
    public static void main(String[] args) {
        /*
        1. Ecrire un programme qui permet de vérifier si un profil est valable pour une candidature
        2. Le profil contient trois critères :
            age : supérieur à 30 ans
            salaire demandé : maximum 40 000€
            années d'expériences : minimum 5 ans
        3. Afficher un message pour chaque condition non respectée
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir votre age");
        int age = scanner.nextInt();

        System.out.println("saisir votre salaire");
        int salaire = scanner.nextInt();

        System.out.println("saisir vos années d'expériences");
        int annee = scanner.nextInt();

        if (age > 30 && salaire < 40000 && annee >=5){
            System.out.println("candidature valable");
        }
        if (age <30){
            System.out.println("Vous êtes trop jeune");
        }
        if (salaire >40000){
            System.out.println("salaire trop haut");
        }
        if (annee <5){
            System.out.println("Vous manquez d'expérience");
        }
    }

}

package org.example.exerciceBase;

import java.util.Scanner;

public class Exercice85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nombreMystere = (int) Math.round(Math.random()*100)+1;
        int nbEssais = 0;

        while (true){
            System.out.println("Veuillez saisir un nombre : ");
            int nombreEntre = scanner.nextInt();
            nbEssais++;

            if (nombreEntre == nombreMystere){
                System.out.println("bravo. Vous avez gagner en "+nbEssais+"tentatives");
                break;
            } else if (nombreEntre>nombreMystere) {
                System.out.println("Le nombre mystere est plus petit");
            }else {
                System.out.println("Le nombre mystere est plus grand");
            }
        }
    }
}

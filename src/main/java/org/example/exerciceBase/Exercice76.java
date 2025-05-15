package org.example.exerciceBase;

import java.util.Scanner;

public class Exercice76 {
    public static void main(String[] args) {
        /*
        1. Définir une variable température
        2. Affecter une valeur à la variable temperature
        3. Selon la température, affiche l'état de l'eau :
            SOLIDE : température inférieure à 0°C
            LIQUIDE : température entre 0 et 100°C
            GAZEUX : température supérieure à 100°C
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir une temperature");
        int temperature = scanner.nextInt();

        if (temperature < 0){
            System.out.println("solide");
        } else if (temperature<100) {
            System.out.println("liquide");
        }else{
            System.out.println("gazeux");
        }

    }
}

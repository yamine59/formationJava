package org.example.exerciceBase;

import java.util.Scanner;

public class Exercice54 {
    public static void main(String[] args) {
        /*
        1. Créer une variable age et lui affecter une valeur
        2. Vérifier si la personne est mineure ou majeure à l'aide des
            opérateurs logiques
        3. Afficher le résultat
        4. /!\ Ne pas utiliser de structure conditionnelle
         */
        System.out.println("entrer votre age");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        System.out.println(age > 18);
    }
}

package org.example.exerciceBase.exercices;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nbrMax = 0;

        for (int i = 1 ; i < 7;i++){
            System.out.println("Veuiller saisir le nombre "+i+" :");
            int nbr = scanner.nextInt();
            if (nbr > nbrMax){
                nbrMax = nbr;
            }
        }


        System.out.println("Le plus grand nombre saisie est : "+nbrMax );

    }
}

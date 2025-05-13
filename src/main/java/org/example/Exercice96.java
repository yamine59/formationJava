package org.example;

public class Exercice96 {
    public static void main(String[] args) {
        int[] tableau = {23,1500,12,28,59,2};
        int max = 0;
        int indMax = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (i == 0){
                max = tableau[i];
            } else if (tableau[i]> max) {
                max = tableau[i];
                indMax = i;

            }

        }
        System.out.println("valeur max est "+max+ " a l'indice "+indMax+" du tableau");
    }
}

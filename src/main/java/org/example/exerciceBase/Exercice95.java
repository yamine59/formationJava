package org.example.exerciceBase;

import java.util.Arrays;

public class Exercice95 {
    public static void main(String[] args) {
        int[] tableauSource = {-5, 3, 24, -12, -10, 5, 100, -2, -71, 0};
        int[] tableauDestination = new int[tableauSource.length];
//
//        for (int i = 0; i < tableauSource.length; i++) {
//            if (tableauSource[i] >= 0){
//                tableauDestination[i] = tableauSource[i];
//            }
//        }
//        System.out.println(Arrays.toString(tableauDestination));

        int c = 0;
        for (int valeur : tableauSource){
            if (valeur > 0){
                tableauDestination[c] = valeur;
                c++;
            }
        }
        System.out.println(Arrays.toString(tableauDestination));

    }
}

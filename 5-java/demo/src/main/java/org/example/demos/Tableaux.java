package org.example.demos;

import java.util.Arrays;

public class Tableaux {
    public static void main(String[] args) {
        //allocation de la memoire pour 5 elements
        int[] ages = new int[5];

        ages[0] = 10;
        ages[1] = 15;
        ages[2] = 8;
        ages[3] = 9;
        ages[4] = 12;

        System.out.println(Arrays.toString(ages));

        System.out.println("Element à l'index 0 : " + ages[0]);
        System.out.println("Element à l'index 1 : " + ages[1]);
        System.out.println("Element à l'index 2 : " + ages[2]);
        System.out.println("Element à l'index 3 : " + ages[3]);
        System.out.println("Element à l'index 4 : " + ages[4]);

        //taille de mon tableau
        System.out.println("Taille du tableau:" + ages.length);

        for (int i = 0; i < ages.length ; i++) {
            System.out.println("Element a l'index " + i + " : " + ages[i]);
        }

        String[] prenoms = {"toto", "tata", "titi"};
    }
}
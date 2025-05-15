package org.example.exerciceBase.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class exercice20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("combien de note a saisir");
        int n = scanner.nextInt();
//        int[]notes = new int [n];
        int[]notes = createTab(n);

        saisieNote(notes,scanner);
        afficheNotes(notes);

    }

    public static void saisieNote(int[] tableau, Scanner paramScan){
        afficheMessage("je suis un message");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("entrer la valeur n°"+ (i+1));
            tableau[i] = paramScan.nextInt();
        }
    }

    public static void afficheNotes(int[] tableau){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("valeur n°"+ (i+1)+" "+ tableau[i]);

        }
    }

    public static int[] createTab (int taille){
        return new int[taille];
    }

    public static void afficheMessage(String message){
        System.out.println("#######"+message+"#######");
    }
}

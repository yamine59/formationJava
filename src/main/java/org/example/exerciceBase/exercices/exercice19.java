package org.example.exerciceBase.exercices;

import java.util.Scanner;

public class exercice19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] note = new int [10];
//        note[0] = 10;
//        note[1] = 10;
//        note[2] = 10;
//        note[3] = 10;
//        note[4] = 10;
//        note[5] = 10;
//        note[6] = 10;
//        note[7] = 10;
//        note[8] = 15;
//        note[9] = 14;
//
//        System.out.println("note  : " + note[8]);
//
//        for (int i = 0; i < note.length; i++) {
//            System.out.println("saisir un numero :");
//            note[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < note.length; i++) {
//            System.out.println("note["+i+"] : "+ note[i]);
//        }
        for (int i = 0; i < note.length; i++) {
            note[i] = (int) ((Math.random()*100+1)/2);
        }
        for (int i = 0; i < note.length; i++) {
            System.out.println("note["+i+"] : "+ note[i]);
        }

    }
}

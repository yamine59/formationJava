package org.example.exercices;

import java.util.Scanner;

public class exercice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i>1 || i<3){
            System.out.println("un chiffre entre 1 et 3");
            i = scanner.nextInt();

        }
    }
}

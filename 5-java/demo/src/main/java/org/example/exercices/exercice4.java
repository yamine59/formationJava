package org.example.exercices;

import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre");
        int a = scanner.nextInt();

        if (a % 3 == 0){
            System.out.println("le nombre "+a+" est divisible par 3 ");
        }else {
            System.out.println("le nombre "+a+" n'est pas divisible par 3");
        }

    }
}

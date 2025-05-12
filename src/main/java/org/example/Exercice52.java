package org.example;

import java.util.Scanner;

public class Exercice52 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir a");
        a = scanner.nextInt();
        System.out.println("saisir b");
        b = scanner.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("la valeur de a est : "+ a +" et b est : "+ b );


    }
}

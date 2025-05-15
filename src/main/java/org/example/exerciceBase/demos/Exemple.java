package org.example.exerciceBase.demos;

import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("entrer un nombre");
        a = scanner.nextInt();
        b = 2 * a;
        System.out.println("le double de "+ a +" est :" + b);
    }
}

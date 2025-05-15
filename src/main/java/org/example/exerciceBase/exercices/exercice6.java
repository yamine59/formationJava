package org.example.exerciceBase.exercices;

import java.util.Scanner;

public class exercice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t,c,n,cn ;
        System.out.println("entrer votre capital");
        c = scanner.nextInt();
        System.out.println("entrer le taux");
        t = scanner.nextInt();
        System.out.println("pendant combien années");
        n = scanner.nextInt();

        cn = c * (Math.pow(1+t/100,n));


        double arroudi = Math.round(cn);
        System.out.println(arroudi);

        double gain = arroudi-c;
        System.out.println("avec un gain de " + gain);
    }
}

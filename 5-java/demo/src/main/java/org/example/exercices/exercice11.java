package org.example.exercices;

import java.util.Scanner;

public class exercice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t,c,cn ;
        System.out.println("entrer votre capital");
        c = scanner.nextInt();
        System.out.println("entrer le taux");
        t = scanner.nextInt();

        cn = 0;
        int n = 0;
        while (cn <= c*2){
            cn = c * (Math.pow(1+t/100,n));
            n++;
        }
        double arroudi = Math.round(cn);
        System.out.println("capital final est de : "+arroudi);
        System.out.println("le nombre années pour double votre capital est de "+n+" ans");
        double gain = arroudi-c;
        System.out.println("avec un gain de " + gain);
    }
}

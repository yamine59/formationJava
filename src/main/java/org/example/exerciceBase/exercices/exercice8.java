package org.example.exerciceBase.exercices;

import java.util.Scanner;

public class exercice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab,bc,ca ;
        System.out.println("entrer la taille de ab");
        ab = scanner.nextInt();
        System.out.println("entrer la taille de bc");
        bc = scanner.nextInt();
        System.out.println("entrer la taille de ca");
        ca = scanner.nextInt();

        if (ab==bc){

            if (bc == ca){
                System.out.println("triangle equilateral");


            }else {
                System.out.println("triangle isocele a b");
            }
        } else if (ab == ca ) {
            System.out.println("triangle isocele a a");

        } else if (ca == bc) {
            System.out.println("triangle isocele a c");

        }else {
            System.out.println("rien");
        }




    }
}

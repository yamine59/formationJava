package org.example.exerciceBase.exercices;

import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer votre age");
        int a = scanner.nextInt();
        if (a<3 ||a >18){
            System.out.println("hors categorie");
        }else {
            switch (a){
                case 3,4,5,6 -> System.out.println("vous etes un baby");
                case 7,8 -> System.out.println("vous etes un poussin");
                case 9,10 -> System.out.println("vous etes un pupille");
                case 11,12 -> System.out.println("vous etes un minime");
                default -> System.out.println("vous etes un cadet");
            }
        }


    }
}

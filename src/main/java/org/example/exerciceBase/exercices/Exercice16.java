package org.example.exerciceBase.exercices;

import java.util.Scanner;

public class Exercice16 {
    public static void main(String[] args) {
        int noteMax = 0;
        int noteMin = 0;
        int nbNote = 5;
        int somme = 0;
        int noteSaisie;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < nbNote; i++) {
            System.out.println("saisir la note n°"+i);
            noteSaisie = scanner.nextInt();
            somme += noteSaisie;
            if (i == 1) {
                noteMax = noteSaisie;
                noteMin = noteSaisie;
            }
            if (noteSaisie > noteMax) {
                noteMax = noteSaisie;
            }
            if (noteSaisie < noteMin) {
                noteMin = noteSaisie;
            }
        }

        int choixMenu ;
        do {
            System.out.println("""
                              Menu :
                    1- Afficher la plus grande note
                    2- Afficher la plus petite note
                    3- Afficher la moyenne 
                    0- Quitter
                    Votre choix :
                    """);
            choixMenu = scanner.nextInt();
            switch (choixMenu){
                case 1-> System.out.println("la note max est : "+noteMax);
                case 2-> System.out.println("la note min est : "+noteMin);
                case 3-> System.out.println("la moyenne est : "+somme/nbNote);
                case 0-> System.out.println("au revoir !!!");
                default->System.out.println("choix invalide !!!");
            }
        }while (choixMenu !=0);

    }
}

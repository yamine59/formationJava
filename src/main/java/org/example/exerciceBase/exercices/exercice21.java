package org.example.exerciceBase.exercices;

import java.util.Scanner;

public class exercice21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] prenoms = {"toto","tata","tutu","titi","yamine"};
        String[] matieres = {"java","algo"};
        int[][] notes = new int[prenoms.length][matieres.length];


        for (int i = 0; i < notes.length ; i++) {
            for (int j = 0; j < notes[i].length ; j++) {
                System.out.println("entrer la note de l etudiant "+prenoms[i]+" dans la matiere "+matieres[j]);
                notes[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < notes.length ; i++) {
            for (int j = 0; j < notes[i].length ; j++) {
                System.out.println("la note de l etudiant "+prenoms[i]+" dans la matiere "+matieres[j] +" est : "+ notes[i][j]);
            }
        }

    }

}

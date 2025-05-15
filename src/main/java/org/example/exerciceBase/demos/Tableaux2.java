package org.example.exerciceBase.demos;

public class Tableaux2 {
    public static void main(String[] args) {
//        String[][] prenoms = new String[3][2];
        String[][] titresNom = {
                {"Mr","Mme","Mlle"},
                {"Dupont","Legrand","Martin"}
        };
        System.out.println(titresNom.length);
        System.out.println(titresNom[0].length);

        System.out.println(titresNom[0][1] + " " + titresNom[1][1]); //mme legrand
        System.out.println(titresNom[1][1] + " " + titresNom[1][2]); // legrand martin
        System.out.println(titresNom[0][2] + " " + titresNom[1][0]); // mlle dupont


    }
}

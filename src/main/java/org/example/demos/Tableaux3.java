package org.example.demos;

public class Tableaux3 {
    public static void main(String[] args) {
        String[] prenoms = {"toto", "tata", "titi", "tutu", "yamine"};
        System.out.println(prenoms.length);

        for (String prenom : prenoms) {
            System.out.println(prenom);
        }

        int[] notes = new int[prenoms.length];
        notes[0] = 10;
        notes[1] = 15;
        notes[2] = 20;
        notes[3] = (int) (Math.random() * 100 + 1) / 5 ;
        notes[4] = 9;
        for (int i = 0; i < notes.length; i++) {
            System.out.println(prenoms[i] + " : " + notes[i]);
        }
        for (int note : notes) {
            System.out.println(note);
        }
    }
}

package org.example.exerciceClasse.exercice3;

public class Main {
    public static void main(String[] args) {
        Joueur player1 = new Joueur("yamine");
        for (int i = 0; i < 40; i++) {
            System.out.println("Le joueur "+player1.getNom()+" effectue une quete "+(i+1));
            player1.effectuerUneQuete();
        }
        System.out.println(player1.getNiveau());
        System.out.println(player1.getXp());

    }
}

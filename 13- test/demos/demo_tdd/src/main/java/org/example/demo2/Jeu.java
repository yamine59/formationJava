package org.example.demo2;


public class Jeu {
    public Ide de;

    public Jeu(Ide de) {
        this.de = de;
    }
    public boolean jouer() {
        return de.lancer() == 20;
    }
}

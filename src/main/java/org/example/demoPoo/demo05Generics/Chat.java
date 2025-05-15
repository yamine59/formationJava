package org.example.demoPoo.demo05Generics;

public class Chat {

    private int nbVies;
    private String nom;

    public Chat(int nbVies, String nom) {
        this.nbVies = nbVies;
        this.nom = nom;
    }

    public int getNbVies() {
        return nbVies;
    }

    public void setNbVies(int nbVies) {
        this.nbVies = nbVies;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "nbVies=" + nbVies +
                ", nom='" + nom + '\'' +
                '}';
    }
}

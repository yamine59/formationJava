package org.example.tp_papeterie.model;

public class Stylo extends Article_unitaire {

    private String couleur;
    public Stylo(String reference, String nom, double pu, String couleur) {
        super(reference, nom, pu);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Stylo : "+ super.toString() +" et un Stylo de couleur " + getCouleur();
    }
}

package org.example.tp_papeterie.model;

public class Article_unitaire extends Article{

    private String nom;
    private double pu;

    public Article_unitaire(String reference, String nom, double pu) {
        super(reference);
        this.nom = nom;
        this.pu = pu;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPu() {
        return pu;
    }

    public void setPu(double pu) {
        this.pu = pu;
    }

    @Override
    public String toString() {
        return "Article_unitaire , réf : " + getReference() + " , nom : " + getNom() + " , prix unitaire : " + getPu() + " euros.";
    }
}

package org.example.exerciceClasse.exercice5;

public class Plante {
    /*
    1. Créer une classe "Plante" avec les attributs suivants : nom, hauteur et
    couleur des feuilles
    2. Ajouter un constructeur, des getters et des setters pour ces attributs
    3. Créer une méthode pour afficher les informations sur la plante


     */

    private String nom;
    private double hauteur;
    private String couleurFeuilles;

    public Plante(String nom, double hauteur, String couleurFeuilles) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuilles = couleurFeuilles;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuilles() {
        return couleurFeuilles;
    }

    public void setCouleurFeuilles(String couleurFeuilles) {
        this.couleurFeuilles = couleurFeuilles;
    }

    @Override
    public String toString() {
        return "Plante du " +
                "nom de " + nom +
                " de hauteur " + hauteur + " cm "+
                " et avec des feuilles " + couleurFeuilles +
                '.';
    }
}

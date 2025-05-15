package org.example.exerciceClasse.exercice5;

public class Arbre extends Plante{

    /*
     4. Créer une classe "Arbre" qui hérite de "Plante" et qui ajoute un attribut
    supplémentaire pour la circonférence du tronc
    5. Surcharger la méthode affiché pour qu'elle ajoute les informations à
    propos de l'arbre
     */
    private double cirTronc;
    public Arbre(String nom, double hauteur, String couleurFeuilles,double cirTronc) {
        super(nom, hauteur, couleurFeuilles);
        this.cirTronc = cirTronc;

    }

    @Override
    public String toString() {
        return super.toString()+" une circonférence du tronc de :"+cirTronc;
    }
}

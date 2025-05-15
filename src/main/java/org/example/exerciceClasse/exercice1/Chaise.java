package org.example.exerciceClasse.exercice1;

public class Chaise {
    /*
    1. Créer une classe Chaise possédant comme variables d’instance le nombre de pieds, le
    matériaux et la couleur de l’objet
    2. Afficher ses informations en surchargeant une méthode de la classe Object
    3. La classe Chaise pourra être instanciée avec ou sans paramètres (Constructeur par
    défaut)
    4. Afficher toutes les chaises (Possibilité de simplifier avec une méthode ToString)

     */
    private int nbrePieds;
    private String materiau;
    private String couleur;

    public Chaise(int nbrePieds, String materiau, String couleur) {
        this.nbrePieds = nbrePieds;
        this.materiau = materiau;
        this.couleur = couleur;
    }

    public Chaise() {
    }

    @Override
    public String toString() {
        return "Chaise a " +nbrePieds +
                " Pieds et en " +  materiau +

                " de couleur" + couleur +
                '.';
    }
}

package org.example.exerciceClasse.exercice1;

public class Main {
    public static void main(String[] args) {
        /*
        1. Créer une classe Chaise possédant comme variables d’instance le nombre de pieds, le
            matériaux et la couleur de l’objet
        2. Afficher ses informations en surchargeant une méthode de la classe Object
        3. La classe Chaise pourra être instanciée avec ou sans paramètres (Constructeur par
            défaut)
        4. Afficher toutes les chaises (Possibilité de simplifier avec une méthode ToString)
         */

        Chaise chaise1 = new Chaise(4, "Plastique", "Bleu");
        Chaise chaise2 = new Chaise(3, "Papier", "Rouge");
        Chaise chaise3 = new Chaise(2, "Bois", "Vert");

        System.out.println(chaise1);
        System.out.println(chaise2);
        System.out.println(chaise3);
        System.out.println();
    }
}
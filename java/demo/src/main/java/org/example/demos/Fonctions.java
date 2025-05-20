package org.example.demos;

public class Fonctions {
    public static void main(String[] args) {
        double p;
        petitNom();
        p = perimetreRectangle(10,15);
        System.out.println("Le perimetre du rectangle est : "+p);
        petitNom();
        p = perimetreRectangle(100,215);
        System.out.println("Le perimetre du rectangle est : "+p);
        petitNom();
    }

    // syntaxe :
    // visibilite autre-caracteristique type-de-retour nom-de-la-fonction (parametres si besoin)
    public static double perimetreRectangle(double largeur,double longueur){
        double perimetre;
        perimetre = 2*(largeur+longueur);
        return perimetre;
    }

    public static void petitNom(){
        System.out.println("Je suis une fonction avec un nom pas terrible !!!!");
    }
}

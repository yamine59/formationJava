package org.example.exerciceBase.demos;


import org.example.exerciceBase.demos.DemoEnum.Couleur;

public class demoString {

    public static void main(String[] args) {
        var phrase = "Hello World !";

        System.out.println(phrase);
        System.out.println(phrase.length());
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.substring(0,5));
        System.out.println(phrase.substring(4));

        String prenom1 = "John";
        String prenom2 = "john";

        System.out.println(prenom1.equals(prenom2));

        Couleur couleur1 = Couleur.ROUGE;
        if (couleur1 == Couleur.ROUGE) {
            System.out.println("couleur rouge");
        }
    }
}

package org.example.demoPoo.demo06List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // syntaxe pour la collection List
        // List<String> prenoms = new ArrayList<String>();
        List<String> prenoms = new ArrayList<>();

        // List<Double> // toujours une liste d'objets => pour les primitifs on utilise les classes wrapper

        // la méthode add() pour ajouter un élements
        prenoms.add("toto");
        prenoms.add("tata");
        prenoms.add("tutu");
        prenoms.add("titi");

        // la methode de get pour acceder a un element par son indice
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));
        System.out.println(prenoms.get(3));

        // la methode set permet de modifier un element a son index précis
        prenoms.set(2,"tyty");
        System.out.println(prenoms.get(2));

        // la methode remove permet de supprimer un element
        System.out.println("Liste avant suppression");
        System.out.println(prenoms);
        prenoms.remove(0);
        System.out.println("Liste apres suppression");
        System.out.println(prenoms);
        System.out.println(prenoms.get(0));
        System.out.println(prenoms);

        // la methode size() qui permet de retourner la taille de la liste
        System.out.println(prenoms.size());


        // parcourir avec la boucle foreach
        for (String p : prenoms){
            System.out.println(p.toUpperCase());
        }

        // parcourir avec un for
        for (int i = 0; i < prenoms.size(); i++){
            System.out.println(prenoms.get(i));
        }



    }
}

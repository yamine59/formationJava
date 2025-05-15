package org.example.demoPoo.demo01BasePoo;


import org.example.demoPoo.demo01BasePoo.classes.Compte;
import org.example.demoPoo.demo01BasePoo.classes.Personne;

public class Main {
    public static void main(String[] args) {

        Compte c1 = new Compte(59,5158.0f);
        Compte c2 = new Compte(15,4058.0f);

        c1.retirer(58f);
        c2.verser(42f);
        System.out.println(c1);

        Personne p = new Personne(59,"yamine",23);
        Personne p2 = new Personne();
        p.setNom("AZERT");
        System.out.println(p.getNom());
        System.out.println(p);
        

    }
}
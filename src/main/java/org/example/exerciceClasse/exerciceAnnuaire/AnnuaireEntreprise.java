package org.example.exerciceClasse.exerciceAnnuaire;

import java.util.ArrayList;
import java.util.List;

public class AnnuaireEntreprise {


    List<Entreprise> entrepriseList = new ArrayList<>();


    public void ajouterEntreprise(String nom, int nSiret, String adresse, String siteWeb) {
        entrepriseList.add(new Entreprise(nom, nSiret, adresse, siteWeb));
        System.out.println("entreprise ajoute");

    }

    public void montrerEntreprise() {

        for (int i = 0; i < entrepriseList.size(); i++) {
            System.out.println(entrepriseList.get(i));
        }
    }

    public void montrerEntrepriseNom() {

        for (int i = 0; i < entrepriseList.size(); i++) {
            System.out.println((i)+"-"+entrepriseList.get(i).getNom());
        }
    }

    public void montrerEntrepriseNom2(int i) {


           System.out.println(entrepriseList.get(i));


    }
}
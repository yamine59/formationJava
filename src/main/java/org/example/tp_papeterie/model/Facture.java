package org.example.tp_papeterie.model;

import org.example.tp_papeterie.FakeDB;

import java.util.Arrays;

public class Facture {

    private String client,date;
    private Ligne[] lignes;
    private int numero;
    private int cpt = 0;

    public Facture(String client, String date, int numero,int nombreLignes) {
        this.client = client;
        this.date = date;
        this.numero = numero;
        this.lignes = new Ligne[nombreLignes];
    }

    public void ajouterLigne(String refArticle, int quantite) {
        lignes[cpt++] = new Ligne(FakeDB.database.get(refArticle), quantite);
    }

    public double getPrixTotal(){
        double prixTotal = 0;
        for (Ligne ligne : lignes) {
            prixTotal += ligne.prixTotal();
        }
        return prixTotal;
    }

    @Override
    public String toString() {
        String detail = "";
        for (Ligne ligne : lignes) {
            detail += " - "+ligne + ", total : " + ligne.prixTotal()  +"\n";
        }
        return "Facture : n" + numero +  "pour le Client : " + client + "du " + date+"\n" +detail + "\nTotal : " + getPrixTotal();
    }
}

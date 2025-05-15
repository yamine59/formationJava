package org.example.exerciceClasse.exerciceAnnuaire;

public class Entreprise {

    private String nom;
    private int nSiret;
    private String adresse;
    private String siteWeb;

    public Entreprise(String nom, int nSiret, String adresse, String siteWeb) {
        this.nom = nom;
        this.nSiret = nSiret;
        this.adresse = adresse;
        this.siteWeb = siteWeb;
    }
    public Entreprise(String nom, int nSiret, String adresse) {
        this.nom = nom;
        this.nSiret = nSiret;
        this.adresse = adresse;
        this.siteWeb = "pas de site web";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getnSiret() {
        return nSiret;
    }

    public void setnSiret(int nSiret) {
        this.nSiret = nSiret;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    @Override
    public String toString() {
        return "L'entreprise " + nom + " est situee a " + adresse +
                " et a pour numero de siret " + nSiret +
                ". vous pouvez la consulter sur son site web : " + siteWeb;
    }
}
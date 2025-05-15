package org.example.exerciceClasse.exerciceBonus2;

public class Salarie {
    /*
    1. Créer une classe Salarié ayant pour attributs : le
    matricule, le service, la catégorie, le nom et le salaire de
    l’employé
    2. Cette classe aura également comme méthode
    AfficherSalaire()

    4. Créer une IHM pour tester le fonctionnement de
    l'application

     */

    private int matricule;
    private String service;
    private String categorie;
    private String nom;
    private double salaire;
    private static int nSalarie;
    private static double salaireTotal;

    public Salarie(int matricule, String service, String categorie, String nom, double salaire) {
        this.matricule = matricule;
        this.service = service;
        this.categorie = categorie;
        this.nom = nom;
        this.salaire = salaire;
        ++nSalarie;
        salaireTotal+=salaire;
    }

    public void AfficherSalaire(){
        System.out.println("Le salaire de "+nom+" est de "+salaire);
    }

    public static double getSalaireTotal() {
        return salaireTotal;
    }

    public static void setSalaireTotal(double salaireTotal) {
        Salarie.salaireTotal = salaireTotal;
    }

    public static int getnSalarie() {
        return nSalarie;
    }

    public static void setnSalarie() {
        Salarie.nSalarie = 0;

    }

    @Override
    public String toString() {
        return "Salarie{" +
                "matricule=" + matricule +
                ", service='" + service + '\'' +
                ", categorie='" + categorie + '\'' +
                ", nom='" + nom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

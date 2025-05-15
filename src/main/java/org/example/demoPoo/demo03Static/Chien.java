package org.example.demoPoo.demo03Static;

public class Chien {
    private String nom;
    private String race;
    private int age;

    private static String espece = "Canis lupus familiaris";
    private static int nbChiens = 0;

    public Chien(String nom, String race, int age) {
        this.nom = nom;
        this.race = race;
        this.age = age;
        nbChiens++;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getEspece() {
        return espece;
    }

    public static void setEspece(String espece) {
        Chien.espece = espece;
    }

    public static int getNbChiens() {
        return nbChiens;
    }

    public static void setNbChiens(int nbChiens) {
        Chien.nbChiens = nbChiens;
    }

    public static void lesChiensPeuventVoler() {
        System.out.println("Les chiens ne peuvent pas voler.");
    }

    @Override
    public String toString() {
        return "Chien " +
                "nom = '" + nom +
                ", race = '" + race +
                ", age = " + age +
                '.';
    }
}

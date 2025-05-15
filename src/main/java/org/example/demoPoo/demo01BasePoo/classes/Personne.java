package org.example.demoPoo.demo01BasePoo.classes;

public class Personne {
    private int code;
    private String nom;
    public int age;

    public Personne(int code, String nom, int age) {
        this.code = code;
        this.nom = nom;
        this.age = age;
    }

    public Personne() {
    }

    public Personne(String nom, int age) {
        this.code = 55;
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom.toLowerCase().startsWith("c")) {
            System.out.println("les prenom commencant par c ne sont pas accepter");
        }
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personne " +
                "code = " + code +
                ", nom = '" + nom + '\'' +
                ", age = " + age +
                '.';
    }


}

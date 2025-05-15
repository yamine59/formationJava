package org.example.demoPoo.demo02Heritage;

public class Canide {

    protected int age;
    protected String nom;

    public Canide(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public void crier(){
        System.out.println("cri du canide");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Canided de nom : "+ nom  + " et d'age " + age +'.';


    }
}

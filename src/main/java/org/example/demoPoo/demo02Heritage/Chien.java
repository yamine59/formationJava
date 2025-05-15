package org.example.demoPoo.demo02Heritage;

public class Chien extends Canide{
    public String race;
    public Chien(int age, String nom, String race) {
        super(age, nom);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void crier(){
        System.out.println("Le chien aboie !!!");
    }

    @Override
    public String toString() {
        return super.toString()+"est un  chien de race "+race;
    }
}

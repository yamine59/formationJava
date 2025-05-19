package org.example.tp_papeterie.model;

public class Ramette extends Article_unitaire {

    private int grammage;
    public Ramette(String reference, String nom, double pu,int grammage) {
        super(reference, nom, pu);
        this.grammage = grammage;
    }

    public int getGrammage() {
        return grammage;
    }

    public void setGrammage(int grammage) {
        this.grammage = grammage;
    }

    @Override
    public String toString() {
        return  "Gramette : "+ super.toString() + " et une ramette de grammage " + grammage;
    }
}

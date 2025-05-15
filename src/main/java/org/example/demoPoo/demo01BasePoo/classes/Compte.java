package org.example.demoPoo.demo01BasePoo.classes;

public class Compte {
    private int code ;
    protected double solde;

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public void verser(float montant){
        solde += montant;
    }

    public void retirer(float montant){
        solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte : " +
                "solde = " + this.solde +
                ", code = " + this.code + '.';
    }
}

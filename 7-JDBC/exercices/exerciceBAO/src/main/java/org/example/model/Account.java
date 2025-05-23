package org.example.model;

public class Account {
    private int id;
    private int idClient;
    private double totalAccount;

    public Account(int idClient, double totalAccount) {
        this.idClient = idClient;
        this.totalAccount = totalAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double depot(double m){
        totalAccount+=m;
        return totalAccount;
    }
    public double retrait(double m){
        totalAccount-=m;
        return totalAccount;
    }

    public double getTotalAccount() {
        return totalAccount;
    }

    public void setTotalAccount(double totalAccount) {
        this.totalAccount = totalAccount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", totalAccount=" + totalAccount +
                '}';
    }
}

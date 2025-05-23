package org.example.model;

public class Operation {
    private int id;
    private int idClient;
    private double montant;
    private int status;

    public Operation(int id, int idClient, double montant, int status) {
        this.id = id;
        this.idClient = idClient;
        this.montant = montant;
        this.status = status;
    }

    public Operation(int status, double montant, int idClient) {
        this.status = status;
        this.montant = montant;
        this.idClient = idClient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", montant=" + montant +
                ", status=" + status +
                '}';
    }
}

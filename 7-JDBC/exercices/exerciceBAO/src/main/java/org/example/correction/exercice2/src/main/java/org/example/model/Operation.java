package org.example.correction.exercice2.src.main.java.org.example.model;

import org.example.model.OperationStatus;

public class Operation {

    private int id;

    private double amount;

    private OperationStatus status;

    private int accountId;


    public Operation(double amount, int accountId) {
        this.amount = amount;
        this.accountId = accountId;
        this.status = (this.amount >= 0) ? OperationStatus.DEPOSIT : OperationStatus.WITHDRAWAL;
    }

    public Operation(int id, double amount, int accountId) {
        this(amount, accountId);
        this.id = id;
    }


    public int getAccountId() {
        return accountId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public OperationStatus getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", amount=" + amount +
                ", status=" + status +
                ", accountId=" + accountId +
                '}';
    }
}

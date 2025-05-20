package org.example.tp_papeterie.model;

public abstract class Article {
    private String reference;
    private int refo;
    public Article(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}

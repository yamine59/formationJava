package org.example.tp_papeterie.model;

public class Lot extends Article{

    private int quantite, pourcentage;
    private Article article ;

    public Lot(String reference, Article article, int quantite, int pourcentage) {
        super(reference);
        this.quantite = quantite;
        this.pourcentage = pourcentage;
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Lot : Compose de : " + article + " , quantite : " + quantite + " , remise : " + pourcentage;
    }
}

package org.example.tp_papeterie.model;

public class Ligne {

    private Article_unitaire article;
    private int quantite;

    public Ligne(Article_unitaire article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public  double prixTotal() {
        return quantite * article.getPu();
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article_unitaire article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void afficheLigne() {
        System.out.println(quantite + " | " +article.getReference() );
    }

    @Override
    public String toString() {
        return quantite + " " + article;
    }
}

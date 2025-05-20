package org.example.classes;


public class AppClient {


        private Integer id;
    private String nom;
    private String prenom;
    public String email;
    public String motDePasse;

    public AppClient() {
        this.id = 1;
        this.nom = "DoE";
        this.prenom = "John";
        this.email = "j.doe@example.com";
        this.motDePasse = "password";
    }

    public String getNomComplet() {
        return prenom.substring(0,1).toUpperCase() +
                prenom.substring(1).toLowerCase() +
                " " +
                nom.toUpperCase();
//        return String.format("%s %s", prenom, nom);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if (prenom.toLowerCase().equals("toto")) return;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

//    @Override
    public String toString() {
        return String.format("%d: Le client %s %s a comme email %s et comme mot de passe %s", id, prenom, nom, email, motDePasse);
    }
}

package org.example.exerciceClasse.exercice2;

import java.sql.Date;
import java.time.LocalDate;

public class Film {
    /*
    1. Créer une classe "Film"
    2. Ajouter les attributs suivants : titre, réalisateur, année de sortie et genre
    3. Ajouter un constructeur, des getters et des setters pour ces attributs, ainsi
    qu'une méthode pour afficher les informations sur le film
     */

    private String titre;
    private String realisateur;
    private LocalDate anneeSortie ;
    private String genre ;

    public Film( String titre, String genre, LocalDate anneeSortie, String realisateur) {

        this.genre = genre;
        this.anneeSortie = anneeSortie ;
        this.realisateur = realisateur;
        this.titre = titre;

    }



    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public LocalDate getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(LocalDate anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", anneeSortie=" + anneeSortie +
                ", genre='" + genre + '\'' +
                '}';
    }
}

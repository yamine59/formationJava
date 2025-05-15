package org.example.exerciceClasse.exercice3;

public class Joueur {
    /*
    1. Créer une classe Joueur
    2. Ajouter les attributs suivants : nom, niveau et points d'expérience
    3. Ajouter un constructeur, des getters et des setters pour ces attributs
    4. Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérience
    au joueur
    5. Créer qu'une méthode qui augmente le niveau du joueur de +1 si son
    expérience dépasse 100 points et réinitialise son expérience
    6. Tester le programme

     */

    private String nom;
    private int niveau;
    private  int xp;

    public Joueur(String nom) {
        this.nom = nom;
        this.niveau = 1;
        this.xp = 0;
    }

    public void effectuerUneQuete(){
        xp += 10;
        augmenterNiveau();
    }

    private void augmenterNiveau(){
        if(this.xp > 100*this.niveau){
            niveau++;
            xp -= 100;
            System.out.println("Le joueur "+this.nom+" a atteint le niveau "+this.niveau);
        }
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}

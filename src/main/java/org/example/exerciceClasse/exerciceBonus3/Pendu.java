package org.example.exerciceClasse.exerciceBonus3;

public class Pendu {
    /*
    1. Réaliser un jeu du pendu en créer une classe Pendu qui
    possédera au minimum comme attributs : le masque, le
    nombre d’essais ainsi que le mot à trouver.
    Cette classe aura comme méthodes : TestChar(),
    TestWin() et GenererMasque().
    2. Le joueur aura par défaut 10 chances pour gagner.
    3. Utiliser une autre classe servant à générer les mots
    pour le jeu, à partir d’un tableau d’entrées potentielles
    4. Optionnellement, le joueur pourra choisir un nombre de
    coups pour sa partie
    5. Créer une IHM pour tester l'application

     */

    private String masque;
    private String motATrouver;
    private int nbreEssais;

    public Pendu(String motATrouver) {
        this.motATrouver = motATrouver;
        this.nbreEssais = 10;
        this.masque = "";
        for(int i = 0; i < motATrouver.length(); i++) {
            this.masque += "_";
        }
    }

    public String getMasque() {
        return this.masque;
    }

    public int getNbreEssais() {
        return this.nbreEssais;
    }

    public void setNbreEssais(int nbreEssais) {
        if (nbreEssais < 0) {
            this.nbreEssais = 0;
        }else {
            this.nbreEssais = nbreEssais;
        }

    }

    public String getMotATrouver() {
        return this.motATrouver;
    }

    public void setMotATrouver(String motATrouver) {
        this.motATrouver = motATrouver;
    }

    public void setMasque(String masque) {
        this.masque = masque;
    }

    public void TestChar(String charTest) {
        for(int i = 0; i < motATrouver.length(); i++) {
            if(motATrouver.charAt(i) == charTest.charAt(0)) {
                this.masque = this.masque.substring(0, i) + charTest.charAt(0) + this.masque.substring(i + 1);
            }
        }
        setNbreEssais(getNbreEssais() - 1);


    }

    public boolean TestWin() {
        for(int i = 0; i < motATrouver.length(); i++) {
            if(motATrouver.charAt(i) != this.masque.charAt(i)) {
                return false;
            }
        }
        return true;
    }






}

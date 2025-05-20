package org.example.exercices;

public class exercice15bis {
    public static void main(String[] args) {
        int nbAnnees = 0;
        while (96809 * Math.pow(1+0.0089,nbAnnees)<120000){
            nbAnnees += 1;
        }
        System.out.println("au bout de "+nbAnnees+" ans a partir de 2015, tourcoing aura depasse les 120 000 habitants.");
    }
}

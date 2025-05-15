package org.example.exerciceClasse.exerciceBonus3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pendu pendu = new Pendu("test");



        String lettre = "";
        System.out.println("vouler vous un nombre d'essais specifique ? (o/n) :");
        lettre = scanner.nextLine();
        if (lettre.equals("o")) {
            System.out.println("Veuillez entrer un nombre d'essais :");
            lettre = scanner.nextLine();
            pendu.setNbreEssais(Integer.parseInt(lettre));
        }
        System.out.println("Voulez vous un mot specifique ? (o/n) :");
        lettre = scanner.nextLine();
        if (lettre.equals("o")) {
            System.out.println("Veuillez entrer un mot :");
            lettre = scanner.nextLine();
            pendu.setMasque(lettre);
        }else{
            String[] mots = {"tigre", "elephant", "singe", "oiseau", "poisson", "chat", "chien", "oiseau", "tortue", "girafe"};
            int index = (int) (Math.random() * mots.length);
            pendu.setMasque(mots[index]);
        }


        while (!pendu.TestWin() && pendu.getNbreEssais() > 0) {
            System.out.println("Le nom a trouver est : " + pendu.getMasque());
            System.out.println("le nombre d'essais restant est de : " + pendu.getNbreEssais());
            System.out.println("Veuillez entrer une lettre :" +pendu.getMotATrouver());
            lettre = scanner.nextLine();
            pendu.TestChar(lettre);

        }
        if (pendu.getNbreEssais() == 0) {
            System.out.println("Vous avez perdu !");
        }else {
            System.out.println("Vous avez gagné !");
        }



    }
}

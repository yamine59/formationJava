package org.example.exerciceClasse.exerciceBonus2;

import java.awt.*;
import java.util.Scanner;
/*
 3. Cette classe pourra, via deux champs et une méthode,
    permettre de savoir le nombre total d’employés, le
    salaire total et remettre à zéro la valeur du nombre
    d’employés dans l’entreprise
 */
public class Main {
    public static void main(String[] args) {
        Salarie salarie1 = new Salarie(59,"informatique","dev","yamine",5000.0);
        Salarie salarie2 = new Salarie(59,"informatique","dev","yamine",55000.0);
        Salarie salarie3 = new Salarie(59,"informatique","dev","yamine",1000.0);
        Scanner scanner = new Scanner(System.in);
        int choixMenu ;
        String newsalarie;
        do {
            System.out.println("""
                              Menu :
                    1- Afficher le nombre total de salarie
                    2- Afficher le salaire total
                    3- la liste des salarie
                    0- Quitter
                    Votre choix :
                    """);
            choixMenu = scanner.nextInt();
            switch (choixMenu){
                case 1-> System.out.println("le nombre total de salarie est : "+Salarie.getnSalarie());
                case 2-> System.out.println("Le salaire total est de : "+ Salarie.getSalaireTotal() );
                case 3-> Salarie.setnSalarie();
                default->System.out.println("choix invalide !!!");
            }


        }while (choixMenu !=0);
    }
}

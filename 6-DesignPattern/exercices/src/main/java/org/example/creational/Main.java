package org.example.creational;

import org.example.creational.builder.Home;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("entrer le nombre d'etage");
        int nbrFloor = Scanner.nextInt();
        System.out.println("entrer le type de toit");
        String typeRoof = Scanner.next();
        System.out.println("entrer la couleur");
        String color = Scanner.next();
        System.out.println("entrer si vous voulez une piscine (oui/non)");
        Scanner.nextLine();
        boolean pool = Scanner.hasNext("oui") ? true : false;


        Home home = new Home.Builder().nbrFloor(nbrFloor).pool(pool).typeRoof(typeRoof).color(color).build();


        System.out.println(home);
    }
}

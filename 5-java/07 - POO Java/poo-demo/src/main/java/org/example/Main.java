package org.example;

import classes.Cat;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nom du chat : ");
         String name = scanner.nextLine();


        System.out.println("Entrer la couleur du chat : ");
         String color = scanner.nextLine();

        System.out.println("Entrer l'age du chat : ");
         int age = scanner.nextInt();


        System.out.println("Entrer le prix du chat : ");
         double price = scanner.nextDouble();

        Cat cat = new Cat(name, color, age, price);
        System.out.println(cat);
        cat.meow();
    }
}
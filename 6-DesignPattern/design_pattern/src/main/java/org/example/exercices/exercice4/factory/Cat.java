package org.example.exercices.exercice4.factory;

public class Cat implements Animal {
    @Override
    public void run() {
        System.out.println("le chat court");
    }

    @Override
    public void makeSound() {
        System.out.println("miaou");
    }
}

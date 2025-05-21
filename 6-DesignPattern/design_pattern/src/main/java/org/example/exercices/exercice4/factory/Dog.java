package org.example.exercices.exercice4.factory;

public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("le chien court !!!");
    }

    @Override
    public void makeSound() {
        System.out.println("wouf");
    }
}

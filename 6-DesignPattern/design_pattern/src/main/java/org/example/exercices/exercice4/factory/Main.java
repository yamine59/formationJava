package org.example.exercices.exercice4.factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal chat = catFactory.createAnimal();
        chat.run();
        chat.makeSound();

        AnimalFactory dogFactory = new DogFactory();
        Animal chien = dogFactory.createAnimal();
        chien.run();
        chien.makeSound();
    }
}

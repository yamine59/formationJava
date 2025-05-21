package org.example.exercices.exercice4.factory;

public class Main {
    public static void main(String[] args) {
//        AnimalFactory catFactory = new CatFactory();
//        Animal chat = catFactory.createAnimal();
//        chat.run();
//        chat.makeSound();
//
//        AnimalFactory dogFactory = new DogFactory();
//        Animal chien = dogFactory.createAnimal();
//        chien.run();
//        chien.makeSound();

        BigFactory bigFactory = new BigFactory();
        bigFactory.enregistrerFactory("chat",new CatFactory());
        bigFactory.enregistrerFactory("chien",new DogFactory());
        Animal cat = bigFactory.produireAnimal("chat");
        cat.run();
        Animal dog = bigFactory.produireAnimal("chien");
        dog.run();
        dog.makeSound();

    }
}

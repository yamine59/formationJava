package org.example.exercices.exercice4.factory;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

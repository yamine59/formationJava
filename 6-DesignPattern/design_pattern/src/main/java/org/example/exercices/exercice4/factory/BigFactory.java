package org.example.exercices.exercice4.factory;

import java.util.HashMap;
import java.util.Map;

public class BigFactory {

    private Map<String,AnimalFactory> factoryMap = new HashMap<>();

    public void enregistrerFactory(String typeFactory,AnimalFactory factory){
        factoryMap.put(typeFactory,factory);
    }

    public Animal produireAnimal(String typeAnimal){
        AnimalFactory factory = factoryMap.get(typeAnimal);
        return factory.createAnimal();
    }
}

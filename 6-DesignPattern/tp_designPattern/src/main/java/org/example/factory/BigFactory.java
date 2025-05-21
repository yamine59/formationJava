package org.example.factory;

import java.util.HashMap;
import java.util.Map;

public class BigFactory {

    private Map<String, ToyFactory> factoryMap = new HashMap<>();
    public void enregistrerFactory(String typeFactory, ToyFactory jouetFactory){
        factoryMap.put(typeFactory,jouetFactory);
    }

    public Toy produireJouet (String typeJouet){
        ToyFactory jouetFactory = factoryMap.get(typeJouet);
        return jouetFactory.createFactory();
    }
}

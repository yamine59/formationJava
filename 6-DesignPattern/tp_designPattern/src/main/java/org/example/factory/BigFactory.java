package org.example.factory;

import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigFactory {

    private Map<String, ToyFactory> factoryMap = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();

    public void enregistrerFactory(String typeFactory, ToyFactory jouetFactory){
        factoryMap.put(typeFactory,jouetFactory);
    }

    public Toy produireJouet (String typeJouet){
        ToyFactory jouetFactory = factoryMap.get(typeJouet);
        if (jouetFactory == null){
            throw new IllegalArgumentException("Le type de jouet n'existe pas : "+typeJouet);
        }
        notifyObserver("Creation de "+typeJouet);
        return jouetFactory.createFactory();


    }
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    public void notifyObserver(String event){
        for (Observer observer:observers){
            observer.onNotify(event);
        }
    }
}

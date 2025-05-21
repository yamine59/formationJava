package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void createEvent(String nameEvent){
        notifyObserver(nameEvent);
    }

    public void notifyObserver(String event){
        for (Observer observer:observers){
            observer.onNotify(event);
        }
    }
}

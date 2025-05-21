package org.example.exercices.exercice3.Observer;

import org.example.demos.behavioral.observer.Subject;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager1 = new EventManager();
        EventManager eventManager2 = new EventManager();

        Observer observer1 = new MyObserver("observer1");
        Observer observer2 = new MyObserver("observer2");

        eventManager1.addObserver(observer1);
        eventManager2.addObserver(observer2);

        eventManager1.notifyObserver("event 1");
        eventManager2.notifyObserver("event 2");


    }



}

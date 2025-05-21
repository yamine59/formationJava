package org.example.exercices.exercice3.Observer;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();


        eventManager.addObserver(new ConsoleLogger());
        eventManager.addObserver(new FileLogger());

//        eventManager.notifyObserver("event 1 !!!");
//        eventManager.notifyObserver("event 2 !!!");

        eventManager.createEvent("pause !!!!");

        eventManager.addObserver(new MailObserver());
        eventManager.createEvent("fin de correction");



    }



}

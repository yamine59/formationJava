package org.example;

import org.example.factory.*;
import org.example.decorator.EmballageDecorator;
import org.example.observer.EventManager;
import org.example.observer.NotifConserver;
import org.example.observer.Observer;
import org.example.observer.SMSObserver;

public class Main {
    public static void main(String[] args) {

        EventManager eventManager = new EventManager();


       eventManager.addObserver(new NotifConserver());


        BigFactory bigFactory = new BigFactory();
        bigFactory.enregistrerFactory("train",new TrainFactory());
        bigFactory.enregistrerFactory("voiture",new VoitureFactory());

        Toy train = bigFactory.produireJouet("train");
        eventManager.createEvent(train.getDescription());
        train = new EmballageDecorator(train);
        eventManager.createEvent(train.getAddDecorator());
        eventManager.createEvent(train.getDescription());

        System.out.println();

        Toy voiture = bigFactory.produireJouet("voiture");
        eventManager.createEvent(voiture.getDescription());
        voiture = new EmballageDecorator(voiture);
        eventManager.createEvent(voiture.getAddDecorator());
        eventManager.createEvent(voiture.getDescription());
        eventManager.addObserver(new SMSObserver());


    }
}
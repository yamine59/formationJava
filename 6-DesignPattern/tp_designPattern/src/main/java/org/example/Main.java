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
        bigFactory.addObserver(new NotifConserver());

        Toy train = bigFactory.produireJouet("train");


        train = new EmballageDecorator(train);


        System.out.println();

        Toy voiture = bigFactory.produireJouet("voiture");

        voiture = new EmballageDecorator(voiture);






    }
}
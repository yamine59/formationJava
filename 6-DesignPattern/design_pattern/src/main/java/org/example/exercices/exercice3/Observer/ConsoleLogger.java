package org.example.exercices.exercice3.Observer;

public class ConsoleLogger implements Observer {

    @Override
    public void onNotify(String event) {
        System.out.println("consoleLogger a recu : "+ event);
    }
}

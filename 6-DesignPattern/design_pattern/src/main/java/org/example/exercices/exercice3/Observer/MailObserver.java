package org.example.exercices.exercice3.Observer;

public class MailObserver implements Observer{
    @Override
    public void onNotify(String event) {
        System.out.println("Envoie d'un mail pour l'event :"+event);
    }
}

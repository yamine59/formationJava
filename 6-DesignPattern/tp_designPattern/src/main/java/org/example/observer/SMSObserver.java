package org.example.observer;

public class SMSObserver implements Observer{
    @Override
    public void onNotify(String message) {
        System.out.println("Livraison de"+ message+" en cours par SMS");
    }
}

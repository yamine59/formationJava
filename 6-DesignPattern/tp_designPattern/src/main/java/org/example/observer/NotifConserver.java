package org.example.observer;

public class NotifConserver implements Observer {

    @Override
    public void onNotify(String message) {
        System.out.println("les lutin sont informer de l'etape de production : "+ message);
    }
}

package org.example.demos.behavioral.observer;

public class MyObserver implements Observer{

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+ " a recu un message "+ message);
    }
}

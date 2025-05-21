package org.example.exercices.exercice3.Observer;

public class MyObserver implements Observer {

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+" a recu : "+ message);
    }
}

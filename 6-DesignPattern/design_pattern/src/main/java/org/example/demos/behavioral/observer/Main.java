package org.example.demos.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new MyObserver("observer 1");
        Observer observer2 = new MyObserver("observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObserver("un nouveau article viens d'arriver !!! ");
    }
}

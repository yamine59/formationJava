package org.example.demoPoo.demo04Interface;

public class ClasseDemo2 implements DemoBaseInterface {
    @Override
    public int giveMeANumber() {
        return 999;
    }

    @Override
    public void direBonjour(String nom) {
        System.out.println("hello "+nom);
    }
}

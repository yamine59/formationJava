package org.example.demoPoo.demo04Interface;

public class ClasseDemo  implements DemoBaseInterface{

    @Override
    public int giveMeANumber() {
        return 45;
    }

    @Override
    public void direBonjour(String nom) {
        System.out.println("bonjour "+nom);
    }
}

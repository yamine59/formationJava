package org.example.demoPoo.demo03Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(Chien.getNbChiens());
        System.out.println(Chien.getEspece());

        Chien chien = new Chien("rex","lako",8);
        Chien chien2 = new Chien("azert","tuipo",5);

        System.out.println(Chien.getNbChiens());
        Chien.lesChiensPeuventVoler();
    }
}

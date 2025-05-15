package org.example.demoPoo.demo02Heritage;

public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien(7,"rex","lako");
        Chien chien2 = new Chien(7,"rezzz","labrador");
        Hyenne hyenne = new Hyenne(12,"tata");
        Hyenne hyenne2 = new Hyenne(12,"tayu");

        Chien[] chiens = {chien,chien2};
        Hyenne[] hyennes = {hyenne,hyenne2};
        Canide[] canides = {chien,chien2,hyenne,hyenne2};

        for (Canide canide : canides) {
            System.out.println("*************************");
            System.out.println(canide);
            if (canide instanceof Chien) {
                canide.crier();
            }
        }

        System.out.println(hyennes.getClass().getSimpleName());
    }
}

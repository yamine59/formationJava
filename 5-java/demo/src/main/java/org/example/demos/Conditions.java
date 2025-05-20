package org.example.demos;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("demo if");

        if (3>2){
            System.out.println("3 est superieur a 2");
        }

        double note = 15;
        if (note>= 15){
            System.out.println("tres bien");
        }else {
            System.out.println("bofff");
        }

        int choix = 2;

        switch (choix){
            case 1:
                System.out.println("test");
                break;
            case 2:
                System.out.println("a");
                break;
            default:
                System.out.println("zzzzzzzzzzz");
                break;
        }

        switch (choix){
            case 1 -> System.out.println("a");
            case 2 -> System.out.println("b");
            default -> System.out.println("c");
        }

        boolean frigoVide = true;
        boolean reservoirVide = false;

        if (frigoVide){
            System.out.println("faire les courses");
            if (reservoirVide){
                System.out.println("mettre le plein de la voiture");
            }
        }else {
            System.out.println("rien a faire");
        }
    }
}
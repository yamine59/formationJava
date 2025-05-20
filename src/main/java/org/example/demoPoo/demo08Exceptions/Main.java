package org.example.demoPoo.demo08Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//        double value;
//
//        try {
//            System.out.println("Par combien voulez vous diviser 45 :");
//            int nbr = scanner.nextInt();
//            value = 45 / nbr;
//        }catch (Exception e){
//            System.out.println("Oups un probleme est survenu !!!!");
//            System.out.println("je met la valeur 0 pour votre calcul !!!");
//            System.out.println("Message de l'exception"+e.getMessage());
//            value = 0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("Oups vous avez essayer de diviser par 0 !!!!");
//            System.out.println("je met la valeur 0 pour votre calcul !!!");
//            System.out.println(e.getMessage());
//            value = 0;
//        }catch (InputMismatchException e){
//            System.out.println("Oups vous n'avez saisie un entier !!!!");
//            System.out.println("je met la valeur 0 pour votre calcul !!!");
//            System.out.println(e.getMessage());
//            value = 0;
//        }


//        System.out.println(value);

        // lever une exception
        // exception non surveiller !!!!
       // throw new DemoUnwatchException("Houston we hava a problem !!!");

//        if(value == 0){
//            throw new DemoWatchException("Encore du travail !!!!");
//        }

        // exeption surveiller
//        try {
//            throw new DemoWatchException("Encore du travail !!!!");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        try {
            ditBonjour("totu");
        }catch (Exception e){
            System.out.println("J'ai eu un probléme");
            System.out.println(e.getMessage());
        }


    }


    public static void ditBonjour(String name) throws DemoWatchException{
        if(name.startsWith("to")){
          //  throw new DemoUnwatchException("Pas de prénom qui commence par to !!!!!");
            throw new DemoWatchException("Pas de to au debut du name !!!!");
        }else {
            System.out.println("Bonjour "+name);
        }

    }
}

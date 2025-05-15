package org.example.demoPoo.demo04Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ClasseDemo demo = new ClasseDemo();
        ClasseDemo2 demo2 = new ClasseDemo2();

        DemoBaseInterface[] demoBaseInterfaces = {demo, demo2};

        IMessage message;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taper 1 pour le francais, 2 pour l'anglais");
        int choix = scanner.nextInt();
        if (choix == 1) {
            message = new MessageV1();
        } else {
            message = new EnglishMessage();
        }

        message.okMessage();
        message.warningMessage();
        message.errorMessage();
    }

}

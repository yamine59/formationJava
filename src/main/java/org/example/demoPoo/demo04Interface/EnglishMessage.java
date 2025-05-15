package org.example.demoPoo.demo04Interface;

public class EnglishMessage implements IMessage{
    @Override
    public void okMessage() {
        System.out.println("this is ok");
    }

    @Override
    public void warningMessage() {
        System.out.println("this is a warning");
    }

    @Override
    public void errorMessage() {
        System.out.println("We have a problem !!!");
    }
}

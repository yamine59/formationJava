package org.example.exercices.exercice2.decorator;

public class BaseText implements Text{
    @Override
    public String transform(String input) {
        return input;
    }

}

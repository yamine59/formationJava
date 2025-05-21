package org.example.factory;

public class Voiture implements Toy{

    @Override
    public String getDescription() {
        return "voiture en metal";
    }

    @Override
    public String getAddDecorator() {
        return "";
    }
}

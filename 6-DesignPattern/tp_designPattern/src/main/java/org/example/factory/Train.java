package org.example.factory;

public class Train implements Toy {

    @Override
    public String getDescription() {
       return "Train en plastique";
    }

    @Override
    public String getAddDecorator() {
        return "";
    }

    @Override
    public String toString() {
        return "Train{}";
    }
}

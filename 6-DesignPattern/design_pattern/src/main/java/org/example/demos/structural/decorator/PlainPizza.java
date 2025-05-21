package org.example.demos.structural.decorator;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza de base";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}

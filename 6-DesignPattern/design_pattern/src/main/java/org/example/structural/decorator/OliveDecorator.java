package org.example.structural.decorator;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " , avec des olives";
    }

    @Override
    public double getCost() {
        return super.getCost()+0.75;
    }
}

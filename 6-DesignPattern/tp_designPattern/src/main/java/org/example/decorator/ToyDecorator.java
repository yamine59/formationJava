package org.example.decorator;

import org.example.factory.Toy;

public abstract class ToyDecorator implements Toy {
    protected Toy jouet;

    public ToyDecorator(Toy jouet) {
        this.jouet = jouet;
    }

    public String getDescription(){
        return jouet.getDescription();
    }

}

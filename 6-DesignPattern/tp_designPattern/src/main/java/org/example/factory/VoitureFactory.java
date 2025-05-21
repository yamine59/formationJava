package org.example.factory;

public class VoitureFactory extends ToyFactory {

    @Override
    public Toy createFactory() {

        return new Voiture();
    }
}

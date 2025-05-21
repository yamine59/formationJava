package org.example.factory;

public class TrainFactory extends ToyFactory {

    @Override
    public Toy createFactory() {

        return new Train();
    }
}

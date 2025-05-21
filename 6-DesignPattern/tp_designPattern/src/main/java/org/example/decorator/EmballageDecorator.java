package org.example.decorator;

import org.example.factory.Toy;

public class EmballageDecorator extends ToyDecorator {
    public EmballageDecorator(Toy jouet) {
        super(jouet);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " qui est emballe";
    }

    @Override
    public String getAddDecorator() {
        return "Emballage en cours....";
    }

}



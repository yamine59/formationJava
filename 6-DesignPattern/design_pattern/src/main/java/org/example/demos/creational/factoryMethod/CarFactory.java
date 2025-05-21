package org.example.demos.creational.factoryMethod;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

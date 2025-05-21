package org.example.demos.creational.factoryMethod;

public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}

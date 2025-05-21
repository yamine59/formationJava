package org.example.demos.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory truckFactory = new CarFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.drive();
    }
}

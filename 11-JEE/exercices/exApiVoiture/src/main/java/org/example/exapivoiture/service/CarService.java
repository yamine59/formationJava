package org.example.exapivoiture.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exapivoiture.model.Car;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {
    private List<Car> carList = new ArrayList<>();

    public Car save (String brand, String yearOfManufacture, String color) {
        int id = carList.size()+1;
        Car car = new Car(id, brand, yearOfManufacture, color);
        carList.add(car);
        return car;
    }

    public List<Car> carList (){
       return carList;
    }

    public Car getCar (int id) {
        return carList.get(id);
    }
}

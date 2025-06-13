package org.example.exapivoiture.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exapivoiture.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class CarService {
    private Map<Integer, Car> carMap = new HashMap<>();

    public Car save (String brand, String yearOfManufacture, String color) {
        int id = carMap.size()+1;
        Car car = new Car(id, brand, yearOfManufacture, color);
        carMap.put(id, car);
        return car;
    }

    public List<Car> carList (){
       return carMap.values().stream().toList();
    }

    public Car getCar (int id) {

        return carMap.get(id);
    }
    public Car updateCar (int id,String brand, String yearOfManufacture, String color){
        Car car = carMap.get(id);
        car.setBrand(brand);
        car.setYearOfManufacture(yearOfManufacture);
        car.setColor(color);
        return car;

    }
    public void deleteCar (int id) {
        carMap.remove(id);
    }
}

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
        return carList.get(-1);
    }
    public Car updateCar (int id,String brand, String yearOfManufacture, String color){
        Car car = carList.get(id-1);
        car.setBrand(brand);
        car.setYearOfManufacture(yearOfManufacture);
        car.setColor(color);
        return car;

    }
    public void deleteCar (int id) {
        carList.remove(id-1);
    }
}

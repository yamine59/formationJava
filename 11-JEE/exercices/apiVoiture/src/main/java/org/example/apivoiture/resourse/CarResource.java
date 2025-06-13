package org.example.apivoiture.resourse;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.apivoiture.model.Car;
import org.example.apivoiture.service.CarService;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/car")
public class CarResource {

    private CarService carService;

    @Inject
    public CarResource(CarService carService) {
        this.carService = carService;
    }


    @GET
    public List<Car> getAllCar(){
        return carService.carList();
    }

    @GET
    @Path("/{id}")
    public Car getCar(@PathParam("id") int id){
        return carService.getCar(id);
    }

    @POST
    @Path("/save")

    public Car save(Car car){
        return carService.save(car.getBrand(), car.getYearOfManufacture(), car.getColor());
    }

    @PUT
    @Path("/update/{id}")

    public Car update(@PathParam("id") int id,Car car){
        return carService.updateCar( id ,car.getBrand(), car.getYearOfManufacture(), car.getColor());
    }

    @DELETE
    @Path("/delete/{id}")
    public void delete(@PathParam("id") int id){
        carService.deleteCar(id);
    }


}

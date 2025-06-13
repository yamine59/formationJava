package org.example.apivoiture.resourse;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.apivoiture.model.Car;
import org.example.apivoiture.service.CarService;

import java.util.List;

@Path("/carresp")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResourceResponse {

    private CarService carService = new CarService();

    @Inject
    public CarResourceResponse(CarService carService) {
        this.carService = carService;
    }

    @POST
    @Path("/save")
    public Response create(Car car) {
        carService.save(car.getBrand(), car.getYearOfManufacture(), car.getColor() );
        return Response.status(Response.Status.CREATED).entity(car).build();
    }

    @GET
    public List<Car> getAllCar() {return carService.carList();}

    @GET
    @Path("/{id}")
    public Response getCar(@PathParam("id") int id) {
        Car car = carService.getCar(id);
        if (car == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(car).build();

    }

    @PUT
    @Path("/update/{id}")
    public Response update(@PathParam("id") int id,Car car){
        Car carUpdate = carService.updateCar( id ,car.getBrand(), car.getYearOfManufacture(), car.getColor());
        if (carUpdate == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(carUpdate).build();
    }

    @DELETE
    @Path("/delete/{id}")
    public Response delete(@PathParam("id") int id){
        Car car = carService.getCar(id);
        if (car == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(car).build();
    }

}

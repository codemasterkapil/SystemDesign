package Car_Rental_System;

import Car_Rental_System.products.Status;
import Car_Rental_System.products.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users=new ArrayList<>();
        List<Store> stores=new ArrayList<>();
        List<Vehicle> car_vehicles=new ArrayList<>();
        List<Vehicle> bike_vehicles=new ArrayList<>();

        for(int i=1;i<=5;i++){
            Vehicle car=new Vehicle();
            car.setPerDaycost(10);
            car.setVehicle_id(i);
            car.setVehicle_number(i*10);
            car.setVehicle_status(Status.INACTIVE);
            car_vehicles.add(car);
        }

        for(int i=1;i<=5;i++){
            Vehicle bike=new Vehicle();
            bike.setPerDaycost(10);
            bike.setVehicle_id(i);
            bike.setVehicle_number(i*10);
            bike.setVehicle_status(Status.INACTIVE);
            bike_vehicles.add(bike);
        }

        Location loc=new Location("delhi cantt","new-delhi","india","delhi");

        for(int i=1;i<=5;i++){
            users.add(new User(i,i*i,"kapil"+i));
        }

        Store store=new Store(loc,1);
        stores.add(store);
        store.setBikeVehicles(bike_vehicles);
        store.setCarVehicles(car_vehicles);
        VehicleRentalSystem sishtum=new VehicleRentalSystem(users,stores);

        Reservation reservation= store.registerReservation(car_vehicles.get(0),users.get(0),loc,2);
        System.out.println(reservation.days);
    }
}
package Car_Rental_System;

import Car_Rental_System.products.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles = new ArrayList<>();

    public VehicleInventoryManagement(List<Vehicle> vehicles){
        this.vehicles=vehicles;
    }
    public List<Vehicle> getVehicles(){
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
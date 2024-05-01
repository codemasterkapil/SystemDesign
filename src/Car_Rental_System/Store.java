package Car_Rental_System;

import Car_Rental_System.products.Vehicle;
import Car_Rental_System.products.Vehicletype;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement carInventory;
    VehicleInventoryManagement bikeInventory;
    Location loc;
    List<Reservation> reservationList=new ArrayList<>();

    Store(Location loc,int storeId){
        this.loc=loc;
        this.storeId=storeId;
    }

    public void setCarVehicles(List<Vehicle>vehicles){
        carInventory=new CarInventorymanagement(vehicles);
    }

    public void setBikeVehicles(List<Vehicle>vehicles){
        bikeInventory=new BikeInventorymanagement(vehicles);
    }

    public Reservation registerReservation(Vehicle vehicle,User user,Location location,int days){
        Reservation reservation=new Reservation();
        reservation.generateReservationId(user,vehicle,location,days);
        reservationList.add(reservation);
        if(vehicle.getVehicle()== Vehicletype.CAR){
            carInventory.removeVehicle(vehicle);
        }else{
            bikeInventory.removeVehicle(vehicle);
        }
        return reservation;
    }

}

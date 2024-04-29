package Car_Rental_System;

import Car_Rental_System.products.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement Vim_obj;
    Location loc;

    List<Reservation> reservationList=new ArrayList<>();

    public void setVehicles(List<Vehicle>vehicles){
        Vim_obj=new VehicleInventoryManagement();
        Vim_obj.setVehicles(vehicles);
    }

    public int registerReservation(Vehicle vehicle,User user){
        Reservation reservation=new Reservation();
        reservationList.add(reservation);
        return reservation.generateReservationId(user,vehicle);
    }

}

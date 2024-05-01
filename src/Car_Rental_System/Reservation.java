package Car_Rental_System;

import Car_Rental_System.products.Vehicle;

import java.util.Date;

public class Reservation {
     int reservationId;
     User user;
     Vehicle vehicle;
     Date bookingDate;
     Location location;
     int days;
     public void generateReservationId(User user,Vehicle vehicle,Location location,int days){
        this.user=user;
        this.vehicle=vehicle;
        this.reservationId=12345;
        this.location=location;
        this.days=days;
     }

}

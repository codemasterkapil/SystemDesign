package Car_Rental_System;

import Car_Rental_System.products.Vehicle;

import java.util.Date;

public class Reservation {
     int reservationId;
     User user;
     Vehicle vehicle;
     Date bookingDate;
     Location location;

     public int generateReservationId(User user,Vehicle vehicle){

        this.user=user;
        this.vehicle=vehicle;
        this.reservationId=12345;

        generateNewLocation();

        return reservationId;

     }
     public void generateNewLocation(){
          this.location=new Location("delhi cantt","new delhi","India","new delhi");
     }


}

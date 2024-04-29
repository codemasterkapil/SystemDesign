package Car_Rental_System;

public class Bill {
    Reservation reservation;
    boolean is_paid;
    double amount;

     Bill(Reservation reservation){
         this.reservation=reservation;
         this.amount=calculateTotalAmount();
         is_paid=false;
     }

     double calculateTotalAmount(){
         return 100.00;
    }

}

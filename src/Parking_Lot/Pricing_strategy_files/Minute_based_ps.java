package Parking_Lot.Pricing_strategy_files;

import Parking_Lot.Ticket;
import Parking_Lot.Vehicle;

public class Minute_based_ps extends  Pricing_strategy{

    public int price(Ticket t, int exit_time){
        return (exit_time-t.entry_time)*10;
    }

}

package Parking_Lot.Pricing_strategy_files;

import Parking_Lot.Ticket;

public abstract class Pricing_strategy {

    public abstract  int price(Ticket tc,int exit_time);

}

package Parking_Lot.Cost_computation_files;

import Parking_Lot.Pricing_strategy_files.Pricing_strategy;
import Parking_Lot.Ticket;

public class Cost_computation {
     Pricing_strategy ps;

    public Cost_computation(Pricing_strategy ps) {
        this.ps = ps;
    }

    public int price(Ticket t,int exit_time) {
        return ps.price(t, exit_time);
    }


}

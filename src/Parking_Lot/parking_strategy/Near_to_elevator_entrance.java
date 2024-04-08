package Parking_Lot.parking_strategy;

import Parking_Lot.parking_spot_files.Parking_spot;

public class Near_to_elevator_entrance extends parking_strategy_type{
    @Override
    public Parking_spot find(){
        return new Parking_spot(2,true,10);
    }

}

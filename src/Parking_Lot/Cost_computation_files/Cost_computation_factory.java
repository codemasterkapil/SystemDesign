package Parking_Lot.Cost_computation_files;

import Parking_Lot.Pricing_strategy_files.Pricing_strategy;
import Parking_Lot.Ticket;
import Parking_Lot.vehicle_type;

public class Cost_computation_factory {

     public static Cost_computation cc_type(Ticket t){
         if(t.v.vehicle== vehicle_type.four_wheeler){
             return new Four_wheeler_cc();
         }else{
             return new Two_wheeler_cc();
         }
     }

}

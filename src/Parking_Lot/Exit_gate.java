package Parking_Lot;

import Parking_Lot.Cost_computation_files.Cost_computation;
import Parking_Lot.Cost_computation_files.Cost_computation_factory;
import Parking_Lot.Parking_Manager_files.Parking_spot_factory;
import Parking_Lot.Parking_Manager_files.Parking_spot_manager;
import Parking_Lot.Pricing_strategy_files.Hour_based_ps;
import Parking_Lot.Pricing_strategy_files.Pricing_strategy;
import Parking_Lot.Ticket;

public class Exit_gate {
   Parking_spot_manager psm;
   Cost_computation cc;

   Vehicle v;

   int Price_calculation(Ticket t,int exit_time){
      cc= Cost_computation_factory.cc_type(t);
      remove_vehicle(t);
      return cc.price(t,exit_time);
   }

   void remove_vehicle(Ticket t){
       psm=Parking_spot_factory.get_parking_spot_manager(t.v);
       psm.remove_vehicle(t.spot);
   }

}

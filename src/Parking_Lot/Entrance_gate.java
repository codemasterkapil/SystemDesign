package Parking_Lot;

import Parking_Lot.Cost_computation_files.Cost_computation;
import Parking_Lot.Parking_Manager_files.Parking_spot_factory;
import Parking_Lot.Parking_Manager_files.Parking_spot_manager;
import Parking_Lot.Ticket;
import Parking_Lot.parking_spot_files.Parking_spot;

public class Entrance_gate {

    Parking_spot_manager psm;

    Ticket find_parking_spot(Vehicle v,int entry_time){

        psm=Parking_spot_factory.get_parking_spot_manager(v);
        Parking_spot p=psm.find_parking_spot();
        if(p!=null){
            book_spot(p);
            return generate_ticket(p,v,entry_time);
        }

        return null;
    }

    void book_spot(Parking_spot p){
         psm.remove_vehicle(p);
    }

    Ticket generate_ticket(Parking_spot ps, Vehicle v, int entry_time){
        return new Ticket(entry_time,v,ps);
    }

}

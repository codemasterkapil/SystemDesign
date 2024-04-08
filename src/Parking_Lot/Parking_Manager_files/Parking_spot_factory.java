package Parking_Lot.Parking_Manager_files;

import Parking_Lot.Vehicle;
import Parking_Lot.parking_spot_files.Parking_spot;
import Parking_Lot.vehicle_type;

public class Parking_spot_factory {


    public static Parking_spot_manager get_parking_spot_manager(Vehicle v){
        if(v.vehicle== vehicle_type.two_wheeler){
            return Two_wheeler_spot_manager.get_twm_factory();
        }else {
            return Four_wheeler_spot_manager.get_fwm_factory();
        }
    }

}

package Parking_Lot.Parking_Manager_files;

import Parking_Lot.Vehicle;
import Parking_Lot.parking_spot_files.Parking_spot;

import java.util.List;

public abstract class Parking_spot_manager {

    List<Parking_spot> ps;
    Parking_spot_manager(List<Parking_spot> ps){
        this.ps=ps;
    }

    abstract Parking_spot find_parking_spot();

    void add_parking_space(){

    }

    void remove_parking_space(){

    }

    void park_vehicle(){

    }


}

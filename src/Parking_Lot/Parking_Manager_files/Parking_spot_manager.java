package Parking_Lot.Parking_Manager_files;

import Parking_Lot.Vehicle;
import Parking_Lot.parking_spot_files.Parking_spot;

import java.util.List;

public abstract class Parking_spot_manager {

    protected List<Parking_spot> ps;
    Parking_spot_manager(List<Parking_spot> ps){
        this.ps=ps;
    }

    public abstract Parking_spot find_parking_spot();

    public void add_parking_space(){

    }

    public void remove_parking_space(){

    }

    public void add_vehicle(Parking_spot p){
        ps.remove(p);
    }

    public void remove_vehicle(Parking_spot p){
        ps.add(p);
    }

}

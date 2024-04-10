package Parking_Lot;

import Parking_Lot.Parking_Manager_files.Two_wheeler_spot_manager;
import Parking_Lot.Parking_Manager_files.Four_wheeler_spot_manager;
import Parking_Lot.parking_spot_files.Parking_spot;
import Parking_Lot.parking_strategy.Near_to_entrance;

import java.util.ArrayList;
import java.util.List;

public class main {




public static void main(String[] args) {
    List<Parking_spot>Two_wheeler_spots=new ArrayList<Parking_spot>();
    List<Parking_spot>Four_wheeler_spots=new ArrayList<Parking_spot>();

    for(int i=0;i<10;i++){
        Two_wheeler_spots.add(new Parking_spot(i,true,9));
        Four_wheeler_spots.add(new Parking_spot(10+i,true,18));
    }

    Two_wheeler_spot_manager.get_twm( Two_wheeler_spots);
    Four_wheeler_spot_manager.get_fwm( Four_wheeler_spots);



}



}

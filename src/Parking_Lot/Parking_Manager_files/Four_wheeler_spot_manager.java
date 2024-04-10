package Parking_Lot.Parking_Manager_files;

import Parking_Lot.parking_spot_files.Parking_spot;
import Parking_Lot.parking_strategy.default_entrance;
import Parking_Lot.parking_strategy.parking_strategy_type;

import java.util.List;

public class Four_wheeler_spot_manager extends Parking_spot_manager{


    private static Four_wheeler_spot_manager fwm;
    public Four_wheeler_spot_manager(List<Parking_spot> ps){
       super(ps);
    }

    @Override
    public Parking_spot find_parking_spot(){
//        parking_strategy_type p=new default_entrance();
//        return p.find();
        if(ps.size()==0){
            return null;
        }else{
            return ps.get(0);
        }

    };

    public static Four_wheeler_spot_manager get_fwm(List<Parking_spot> ps){
        if(fwm==null){
            fwm = new Four_wheeler_spot_manager(ps);
        }
        return fwm;
    }

    static Four_wheeler_spot_manager get_fwm_factory(){
        return fwm;
    }

}

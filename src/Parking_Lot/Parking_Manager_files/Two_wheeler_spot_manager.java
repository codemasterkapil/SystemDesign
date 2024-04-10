package Parking_Lot.Parking_Manager_files;

import Parking_Lot.parking_spot_files.Parking_spot;
import Parking_Lot.parking_strategy.default_entrance;
import Parking_Lot.parking_strategy.parking_strategy_type;

import java.util.List;

public class Two_wheeler_spot_manager extends Parking_spot_manager{

    private static Two_wheeler_spot_manager twm;
    private Two_wheeler_spot_manager(List<Parking_spot> ps){
        super(ps);
    }

    @Override
    public Parking_spot find_parking_spot(){
//        parking_strategy_type p=new default_entrance();
//        return p.find();
//

        if(ps.size()==0){
            return null;
        }else{
            return ps.get(0);
        }


    };

    public static Two_wheeler_spot_manager get_twm(List<Parking_spot> ps){
        if(twm==null){
            twm = new Two_wheeler_spot_manager(ps);
        }
        return twm;
    }


    static Two_wheeler_spot_manager get_twm_factory(){
        return twm;
    }


}

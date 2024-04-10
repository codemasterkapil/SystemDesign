package Parking_Lot.Cost_computation_files;

import Parking_Lot.Pricing_strategy_files.Minute_based_ps;
import Parking_Lot.Pricing_strategy_files.Pricing_strategy;

public class Four_wheeler_cc extends Cost_computation{

    public Four_wheeler_cc() {
        super(new Minute_based_ps());
    }

}

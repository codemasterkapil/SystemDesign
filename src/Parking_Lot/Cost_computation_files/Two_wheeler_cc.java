package Parking_Lot.Cost_computation_files;

import Parking_Lot.Pricing_strategy_files.Hour_based_ps;
import Parking_Lot.Pricing_strategy_files.Pricing_strategy;

public class Two_wheeler_cc extends Cost_computation {
    public Two_wheeler_cc() {
        super(new Hour_based_ps());
    }
}

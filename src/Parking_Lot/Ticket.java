package Parking_Lot;

import Parking_Lot.parking_spot_files.Parking_spot;

public class Ticket {

    int entry_time;
    Vehicle v;
    Parking_spot spot;

    public Ticket(int entry_time, Vehicle v, Parking_spot spot) {
        this.entry_time = entry_time;
        this.v = v;
        this.spot = spot;
    }

}

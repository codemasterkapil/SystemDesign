package Strategy_Pattern;

public class Strategy {
    public static void main(String[] args) {

        DriveStrategy obj1 = new SpecialDrive();
        DriveStrategy obj2 = new NormalDrive();
        DriveStrategy obj3 = new XYZDrive();

        Sports_vehicle sv = new Sports_vehicle(new SpecialDrive());
        OFF_Road_vehicle ofv = new OFF_Road_vehicle(obj2);
        Passenger_vehicle pv = new Passenger_vehicle(obj3);

        sv.drive();
        ofv.drive();
        pv.drive();

    }
}

package Strategy_Pattern;

public class Vehicle {
    DriveStrategy obj;

    Vehicle(DriveStrategy obj) {
        this.obj = obj;
    }

    public void drive() {
        obj.Drive();
    }
}

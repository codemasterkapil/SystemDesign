package NullObjectPattern;

public class VehicleFactory {
    public static Vehicle getVehicleObject(String vehicle)
    {
       if("car".equals(vehicle)){
           return new Car();
       }
       return new NullVehicle();
    }
}

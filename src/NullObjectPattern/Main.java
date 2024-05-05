package NullObjectPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle=VehicleFactory.getVehicleObject("bike");
        Main.printVehicleDetails(vehicle);

    }

    public static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Total seats are : "+vehicle.getSeatingCapacity());
        System.out.println("Total Tank Capacity is : "+vehicle.getTankCapacity());
    }

}

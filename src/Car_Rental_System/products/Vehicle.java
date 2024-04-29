package Car_Rental_System.products;

public class Vehicle {
    int id;
    int vehicle_number;
    int numberOfTyres;
    Vehicletype vtype;

    Status status;

    int perDaycost;
    void setVehicle_number(int number){
        this.vehicle_number=number;
    }
    void setVehicle_id(int id){
        this.vehicle_number=id;
    }

    void setVehicle_vtype(Vehicletype vtype){
        this.vtype=vtype;
    }

    void setVehicle_status(Status status ){
        this.status=status;
    }

    int getVehicle_number(int number){
        return number;
    }
    int getVehicle_id(int id){
        return id;
    }

    Vehicletype getVehicle_vtype(Vehicletype vtype){return vtype;
    }

    Status getVehicle_status(Status status ){
        return status;
    }

}

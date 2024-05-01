package Car_Rental_System.products;

public class Vehicle {
    int id;
    int vehicle_number;
    int numberOfTyres;
    Vehicletype vtype;

    Status status;

    int perDaycost;

    public void setVehicle_number(int number)
    {
        this.vehicle_number=number;
    }
    public void setVehicle_id(int id)
    {
        this.vehicle_number=id;
    }

    public void setVehicle(Vehicletype vtype)
    {
        this.vtype=vtype;
    }

    public void setVehicle_status(Status status)
    {
        this.status=status;
    }

    public void setPerDaycost(int cost)
    {
        this.perDaycost=cost;
    }
    public int getVehicle_number()
    {
        return vehicle_number;
    }
    public int getVehicle_id()
    {
        return id;
    }
    public Vehicletype getVehicle()
    {
        return vtype;
    }
    public Status getVehicle_status()
    {
        return status;
    }
    public int getVehiclecost()
    {
        return this.perDaycost;
    }
}

package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    String theatreName;
    int theatreId;
    CityName city;
    String address;
    List<Hall>Halls=new ArrayList<>();

    public String getTheatreName() {
        return theatreName;
    }
    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public CityName getCity() {
        return city;
    }

    public void setCity(CityName city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public List<Hall> getHalls() {
        return Halls;
    }
    public void setHalls(List<Hall> halls) {
        Halls = halls;
    }
}

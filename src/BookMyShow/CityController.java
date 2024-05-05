package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class CityController {
    List<City> cityController=new ArrayList<>();

    public List<City> getCityController() {
        return cityController;
    }

    public void setCityController(List<City> cityController) {
        this.cityController = cityController;
    }

    public void addCity(City city)
    {
        cityController.add(city);
    }
    public void removeCity(City city)
    {
        cityController.remove(city);
    }

}

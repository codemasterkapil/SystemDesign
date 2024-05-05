package BookMyShow;

public class City {
    CityName cityName;
    TheatreController theatreController;

    public CityName getCityName() {
        return cityName;
    }

    public void setCityName(CityName cityName) {
        this.cityName = cityName;
    }

    public TheatreController getTheatreController() {
        return theatreController;
    }

    public void setTheatreController(TheatreController theatreController) {
        this.theatreController = theatreController;
    }
}

package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    int hallId;
    List<Show> shows=new ArrayList<>();
    public List<Show> getShows() {
        return shows;
    }
    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
    public int getHallId() {
        return hallId;
    }
    public void setHallId(int hallId) {
        this.hallId = hallId;
    }
}

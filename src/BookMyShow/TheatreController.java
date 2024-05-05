package BookMyShow;

import java.util.List;

public class TheatreController {
     List<Theatre>theatres;

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    public void addTheatre(Theatre theatre)
    {
        theatres.add(theatre);
    }
    public void removeTheatre(Theatre theatre)
    {
        theatres.remove(theatre);
    }

    public void bookTicket(int theatreId,int hallId,Show show)
    {
        for (Theatre theatre : theatres) {
            if(theatre.theatreId==theatreId)
            {
                theatre.bookTicket(hallId,show);
            }
        }
    }

}

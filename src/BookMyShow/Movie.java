package BookMyShow;

public class Movie {
      int movieId;
      String name;
      int duration;

      public String getMovieName()
      {
          return this.name;
      }

      public int getMovieId()
      {
          return this.movieId;
      }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration()
      {
          return this.duration;
      }

}

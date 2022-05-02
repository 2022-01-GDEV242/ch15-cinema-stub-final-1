import java.sql.Time;
/**
 * Each showing object has an associated theatre and movie. Each showing has accessor methods
 * for theatre number, movie length and movie title.
 *
 * @author Ryan Rutishauser
 * @version R4-30
 */
public class Showing
{
    // instance variables - replace the example below with your own
    private Movie movie;
    private Theatre theatre;
    private String date;
    private String time;

    /**
     * Constructor for objects of class Showing
     */
    public Showing(Movie movie, Theatre theatre, String Date, String time)
    {
        this.movie = movie;
        this.theatre = theatre;
        this.date = date;
        this.time = time;
    }

    /**
     * @return length of movie.
     */
    public int getRunTime()
    {
        return movie.getRunTime();
    }
    
    /**
     * @return movie title.
     */
    public String getMovieLength()
    {
        return movie.getTitle();
    }
    
    /**
     * @return theatre of the showing.
     */
    public String getTheatre()
    {
        return theatre.getTheatreNumber();
    }
}

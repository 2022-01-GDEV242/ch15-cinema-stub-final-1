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
    private Theater theater;
    protected String date;
    protected String time;

    /**
     * Constructor for objects of class Showing
     */
    public Showing(Movie movie, Theater theater, String Date, String time)
    {
        this.movie = movie;
        this.theater = theater;
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
    public String getMovieTitle()
    {
        return movie.getTitle();
    }
    
    /**
     * @return theatre of the showing.
     */
    public String getTheater()
    {
        return theater.getTheaterNumber();
    }
}

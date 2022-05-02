
/**
 * Each showing object has an associated theatre and movie. Each showing has accessor methods
 * for theatre number and movie length.
 *
 * @author Ryan Rutishauser
 * @version R4-30
 */
public class Showing
{
    // instance variables - replace the example below with your own
    private Movie movie;
    private Theatre theatre;

    /**
     * Constructor for objects of class Showing
     */
    public Showing(Movie movie, Theatre theatre)
    {
        this.movie = movie;
        this.theatre = theatre;
    }

    /**
     * @return length of movie.
     */
    // public int getMovieLength()
    // {
        // return movie.getMovieLength();
    // }
    
    /**
     * @return movie title.
     */
    // public String getMovieLength()
    // {
        // return movie.getTitle();
    // }
    
    /**
     * @return theatre of the showing.
     */
    public String getTheatre()
    {
        return theatre.getTheatreNumber();
    }
}


/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private Showing showing;
    private Seat seat;
    private Customer customer;
    private Movie movie;
    

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(Showing showing, Seat seat, Customer customer)
    {
        Ticket Ticket = new Ticket(showing, seat, customer);
        
        this.showing = showing;
        this.movie = movie;
        this.seat = seat;
        this.customer = customer;
    }

    public String getMovieTitle()
    {
        //shouldent this be part of the constructor?
        return movie.getTitle();
    }
    
    public void getSeat()
    {
        //shouldent this be part of the constructor?
    }
    
    public void getTheatre()
    {
        //shouldent this be part of the constructor?
    }
    
    public void getShowing()
    {
        //shouldent this be part of the constructor?
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     */
    public double getCustomerNumber()
    {
        return customer.phoneNumber;
    }
}

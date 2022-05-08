import java.util.Random;
/**
 * Each ticket has a confirmation number, a showing, a seat, and a customer. Each has a printable format
 * a accessor for movie title, seat number, theater number, showing time and date, and confirmation number.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private Random confermationNumber = new Random(1000000);
    private Showing showing;
    private Seat seat;
    private Customer customer;
    private int confNumber;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(Showing showing, Seat seat, Customer customer)
    {
        confNumber = confermationNumber.nextInt();
        this.showing = showing;
        this.seat = seat;
        this.customer = customer;
    }
    
    /**
     * @ returns movie title
     */
    public String getMovieTitle()
    {
        //
        return showing.getMovieTitle();
    }
    
    /**
     * @ returns seat number.
     */
    public void getSeat()
    {
        //
    }
    /**
     * @ returns theater number.
     */
    public void getTheater()
    {
        //
    }
    
    /**
     * @ returns showing date and time.
     */
    public void getShowing()
    {
        //
    }
    
    /**
     * @ return confNumber
     */
    public int getConfNumber()
    {
        return confNumber;
    }
    
    /**
     * Puts tickets information in a printable format for the customer to print and bring to the movie
     * or show theater employee from smartphone at the theater as proof.
     */
    public void print()
    {
        
    }
    
    
}

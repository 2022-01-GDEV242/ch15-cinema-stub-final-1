import java.util.Random;
/**
 * Each ticket has a confirmation number, a showing, a seat, and a customer. Each has a printable format
 * a accessor for movie title, seat number, theater number, showing time and date, and confirmation number.
 *
 * @author Gunnar Hunt
 * @version G5-08
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private Random confermationNumber = new Random(1000000);
    private Showing showing;
    private Seat seat;
    private Customer customer;
    private Theater theater;
    private int confNumber;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(Showing showing, Seat seat, Customer customer, Theater theater)
    {
        confNumber = confermationNumber.nextInt();
        this.showing = showing;
        this.seat = seat;
        this.customer = customer;
        this.theater = theater;
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
    public String getSeat()
    {
        return seat.getSeatNumber();
    }
    
    /**
     * @ returns theater number.
     */
    public String getTheater()
    {
        return theater.getTheaterNumber();
    }
    
    /**
     * @ returns showing date and time.
     */
    public String getShowingDate()
    {
        return showing.date;
    }
    
    public String getShowingTime()
    {
        return showing.time;
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
        System.out.println("Ticket \n \n==============================");
        System.out.println("Movie: " + getMovieTitle() + "\n");
        System.out.println("Your movie will play on " + getShowingDate() + " at " + getShowingTime() + "\n");
        System.out.println("Your Theater Number: " + getTheater() + "\nYour Seat Number: " + getSeat() + "\n");
        System.out.println("Confirmation Number: " + confNumber + "\n");
        System.out.println("Please show this ticket to the employees at our theater. \nThank you for using our theater!");
    }
    
    
}

import java.util.ArrayList;
/**
 * This class manages all of the other classes and is what are the methods the movie theater employee uses to manage reservations cancelations and
 * other movie theater processes.
 *
 * @author Ryan
 * @version R5-08
 */
public class BookingSystem
{
    // instance variables - replace the example below with your own
    private ArrayList<Customer> customers;
    private ArrayList<Showing> showings;
    private ArrayList<Theater> theaters;
    private ArrayList<Ticket> tickets;

    /**
     * Constructor for objects of class BookingSystem
     */
    public BookingSystem()
    {
        // initialise instance variables
        customers = new ArrayList<>();
        showings = new ArrayList<>();
        theaters = new ArrayList<>();
        tickets = new ArrayList<>();
    }
    
    /**
     * Create all the theaters.
     */
    public void createTheaters()
    {
        Theater one, two, three, four, five;
        
        one = new Theater("one");
        theaters.add(one);
        two = new Theater("two");
        theaters.add(two);
        three = new Theater("three");
        theaters.add(three);
        four = new Theater("four");
        theaters.add(four);
        five = new Theater("five");
        theaters.add(five);
        
        one.setRows(10, 10);
        one.setRows(10, 8);
        
        two.setRows(4, 5);
        two.setRows(10, 7);
        two.setRows(4, 5);
        
        three.setRows(5, 7);
        three.setRows(2, 4);
        three.setRows(5, 7);
        
        four.setRows(2, 10);
        four.setRows(1, 8);
        four.setRows(2, 10);
        four.setRows(5, 8);
        
        five.setRows(1, 8);
        five.setRows(9, 10);
    }

    /**
     * This method is going to take a certain showing, iterate over seats in a certain theater, and 
     * print unreserved seat numbers.
     *
     * @param showing
     */
    public void seatSeach(Showing showing)
    {
        
    }
    
    /**
     * This method will call the reserve method on a seat with the entered seat number for the specified showing. 
     * It must be ran for each individual seat. 
     *
     * @param showing, seat number
     */
    public void seatBook(Showing showing, String seatNumber)
    {
        
    }
    
    /**
     * This method will call the cancel method on a seat with the entered seat number for the specified showing. 
     *
     * @param showing, seat number
     */
    public void cancelSeatBook(Showing showing, String seatNumber)
    {
        
    }
    
    /**
     * This method will find a showing of the specified movie on a specified date and will return the showing time. 
     *
     * @param movie title, date
     * @return time
     */
    public void findShowing(String movieTitle, String date)
    {
        
    }
    
    /**
     * This method will provide the customer's information if he can provide the confirmation number in the 
     * event he forgot some peice of information associated with his reservation. It will do this by calling
     * the print ticket method for a ticket with a given confirmation number.
     *
     * @param name
     */
    public void findInformation(String name)
    {
        
    }
    
    /**
     * This method can find and provide all the customer's phone numbers who have reserved a ticket for a specific showing
     * in the event a showing is cancelled.
     * It will do this by printing out the the phone number from the customer who has a ticket at a specific showing.
     *
     * @param confirmation number
     */
    public void findCustomers(Showing showing)
    {
        
    }
}

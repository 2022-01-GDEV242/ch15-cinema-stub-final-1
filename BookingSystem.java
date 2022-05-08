import java.util.ArrayList;
/**
 * Write a description of class BookingSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookingSystem
{
    // instance variables - replace the example below with your own
    private ArrayList<Customer> customers;
    private ArrayList<Showing> showings;
    private ArrayList<Theater> theaters;

    /**
     * Constructor for objects of class BookingSystem
     */
    public BookingSystem()
    {
        // initialise instance variables
        customers = new ArrayList<>();
        showings = new ArrayList<>();
        theaters = new ArrayList<>();
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
     * This method is going to take a certain showing and iterate over seats and 
     * print unreserved seat numbers that are in a line of groupSize. If group size is even, 
     * it will print unreserved seat numbers that are in square groupings of groupSize. For instance, 
     * if group size equals 4, a 2x2 square.
     *
     * @param showing, groupSize
     */
    public void groupBook()
    {
        
    }
    
    /**
     * This method is going to take a certain showing and iterate over seats and 
     * print unreserved seats that are in a line of groupSize
     *
     * @param showing
     */
    public void individualBook()
    {
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void findCustomer()
    {
        
    }
}

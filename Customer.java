import java.util.Random;
/**
 * Each customer has a phone number that is associated with them.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int phoneNumber;

    /**
     * Creates an object of type Customer the confermation number is assigned at random.
     * the user inputs the customers phone number. 
     * 
     * @param phoneNumber the customers phone number
     */
    public Customer(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        
    }
    
    /**
     * @returns phone number number.
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
}
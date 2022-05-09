/**
 * Each customer has a name and phone number that is associated with them.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int phoneNumber;
    protected String name;

    /**
     * Creates an object of type Customer.
     * the user inputs the customers phone number. 
     * 
     * @param phoneNumber the customers phone number
     */
    public Customer(int phoneNumber, String name)
    {
        this.phoneNumber = phoneNumber;
        this.name = name;
        
    }
    
    /**
     * @returns phone number number.
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * @returns name of customer.
     */
    public String getName()
    {
        return name;
    }
}
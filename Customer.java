import java.util.Random;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private Random confermationNumber = new Random(1000000);
    protected double phoneNumber;
    private double confNumber;

    /**
     * Creates an object of type Customer the confermation number is assigned at random.
     * the user inputs the customers phone number. 
     * 
     * @param phoneNumber the customers phone number
     */
    public Customer(double phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        confNumber = confermationNumber.nextInt();
        
    }
}
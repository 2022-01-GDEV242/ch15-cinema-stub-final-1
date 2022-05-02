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
    private double phoneNumber;
    private double confNumber;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(double phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        confNumber = confermationNumber.nextInt();
        
    }
}
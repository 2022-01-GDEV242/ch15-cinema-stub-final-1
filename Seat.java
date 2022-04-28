
/**
 * Write a description of class Seat here.
 *
 * @author (your name)
 * @version J4-26
 * 
 * added getters and setters for seatNumber. I also started the constuctor.
 * added the boolean is reserved.
 */
public class Seat
{
    // instance variables - replace the example below with your own
    private boolean isReserved;
    private int seatNumber;

    /**
     * Constructor for objects of class Seat
     */
    public Seat(Row row)
    {
        
    }
    
    /**
     * alows the seatNumber to be set
     * 
     * @param seatNum stores the number the seat will have.
     */
    public void setSeatNumber(int seatNum){
        seatNumber = seatNum;
    }
    
    /**
     * Returns the seatNumber
     * 
     * @return Returns seatNumber
     */
    public int getSeatNumber(){
        return seatNumber;
    }
}

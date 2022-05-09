import java.util.ArrayList;
/**
 * Each Row object represents a single row in a movie theatre. Each row has an arrayList of 
 * seats in it and a row number. There are accessor methods to get the row number and number
 * of seats in the row.
 *
 * @author Ryan Rutishauser
 * @version R5-08
 */
public class Row
{
    // instance variables - replace the example below with your own
    private ArrayList<Seat> seats;
    private int numSeats;
    private String rowNumber;

    /**
     * Constructor for objects of class Row
     */
    public Row(int numSeats, String rowNumber)
    {
        seats = new ArrayList<>();
        this.numSeats = numSeats;
        this.rowNumber = rowNumber;
    }
    
    /**
     *This method creates numSeats number of seats in a row along with passing 
     *the seat number to each seat object based on the row number and seat positon in
     *the row.
     */
    public void setSeats()
    {
        for(int k = 1; k < (numSeats + 1); ++k){
            
            String seatNumber = rowNumber + "-" + k;
            seats.add(new Seat(seatNumber));
        }
    }
    
    /**
     * @return number of seats in row.
     */
    public int getSeats()
    {
        return numSeats;
    }
    
    /**
     * @return row number
     */
    public String getRowNumber()
    {
        return rowNumber;
    }
}

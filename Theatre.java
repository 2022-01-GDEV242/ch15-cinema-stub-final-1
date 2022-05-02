import java.util.ArrayList;
/**
 * Each theatre object represents a single theatre at a movie theatre. Each theatre has an arrayList
 * of rows in it and a theatre number to identify it. Additionally, each theatre has a number of rows,
 * and number of seats per row for the purpose of being passed to the row objects that are created.
 * There are accessor methods for number of rows and theatre number.
 *
 * @author Ryan Rutishauser
 * @version R4-30
 */
public class Theatre
{
    // instance variables - replace the example below with your own
    private ArrayList<Row> rows;
    private int numRows;
    private int numSeatsRow;
    private String theatreNumber;

    /**
     * Constructor for objects of class Theatre
     */
    public Theatre(int numRows, int numSeatsRow, String theatreNumber)
    {
        // initialise instance variables
        rows = new ArrayList<>();
        this.numRows = numRows;
        this.numSeatsRow = numSeatsRow;
        this.theatreNumber = theatreNumber;
    }

    /**
     *This method creates numRows number of rows in a theatre along with passing 
     *the row number to each row object based on the row positon in the theatre. 
     */
    public void setRows()
    {
        for(int k = 1; k < (numRows + 1); ++k){
            String rowNumber = "" + k;
            rows.add(new Row(numSeatsRow, rowNumber));
        }
    }
    
    /**
     * @return number of rows
     */
    public int getRows()
    {
        return numRows;
    }
    
    /**
     * @return theatre number
     */
    public String getTheatreNumber()
    {
        return theatreNumber;
    }
}

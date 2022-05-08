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
public class Theater
{
    // instance variables - replace the example below with your own
    private ArrayList<Row> rows;
    private int numRows;
    private String theaterNumber;

    /**
     * Constructor for objects of class Theater
     */
    public Theater(String theaterNumber)
    {
        // initialise instance variables
        rows = new ArrayList<>();
        numRows = 0;
        this.theaterNumber = theaterNumber;
    }

    /**
     *This method creates numRows number of rows in a theatre along with passing 
     *the row number to each row object based on the row positon in the theatre. 
     */
    public void setRows(int numberRows, int numSeatsRow)
    {   
        for(int k = (numRows + 1); k < (numberRows + 1); ++k){
            String rowNumber = "" + k;
            rows.add(new Row(numSeatsRow, rowNumber));
        }
        numRows += numberRows;
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
    public String getTheaterNumber()
    {
        return theaterNumber;
    }
}

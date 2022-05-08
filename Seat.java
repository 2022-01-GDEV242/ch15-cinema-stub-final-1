
/**
 * Each seat object represents a single seat in a row of a movie theatre.
 * Each seat is initially set so as not to be reserved but can be reserved using 
 * reserve method. Additionally, a reservation can be cancelled using cancel method.
 * Each seat has a reservation status, isReserved and a seatNumber String which is created
 * based on its row number and position in that row.
 *
 * @author Ryan Rutishauser
 * @version R4-30
 * 
 * added getters and setters for seatNumber. I also started the constuctor.
 * added the boolean is reserved. 
 */
public class Seat
{
    // instance variables - replace the example below with your own
    private boolean isReserved;
    private String seatNumber;

    /**
     * Constructor for objects of class Seat
     */
    public Seat(String seatNumber)
    {
        isReserved = false;
        this.seatNumber = seatNumber;
    }
    
    /**
     * Returns the seatNumber
     * 
     * @return Returns seatNumber
     */
    public String getSeatNumber(){
        return seatNumber;
    }
    
    /**
     * Allows seat to be reserved.
     */
    public void reserve(){
        if(isReserved == false){
            isReserved = true;
        }
        else{
            System.out.println("Seat " + seatNumber + " is already reserved.");
        }
    }
    
    /**
     * Allows seat reservation to be cancelled.
     */
    public void cancel(){
        if(isReserved == true){
            isReserved = false;
        }
        else{
            System.out.println("Seat " + seatNumber + " has not been reserved yet.");
        }
    }
    
    /**
     * @returns whether seat is reserved or not.
     */
    public boolean getReservationStatus(){
        return isReserved;
    }
}

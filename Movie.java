
/**
 * Write a description of class Movie here.
 *
 * @author Jake Kymer
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int runTime;
    private String title;

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String title, int runTime)
    {
        this.title = title;
        this.runTime = runTime;
    }

    /**
     * 
     */
    public void setRunTime(int time){
        runTime = time; 
    }
    
    public int getRunTime(){
        return runTime;
    }
    
    /**
     * returns the time of the movie + 30 min for clean up.
     * 
     * @return runTime + 30
     */
    public int getExtendedRunTime(){
        return (runTime + 30);
    }
    
    public void setTitle(String movieName){
        title = movieName;
    }
    
    public String getTitle(){
        return title;
    }
}


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
     * creates an object of type movie
     * 
     * @param title the movie title
     * @param runTime the lenght of the movie
     */
    public Movie(String title, int runTime)
    {
        this.title = title;
        this.runTime = runTime;
    }

    /**
     * sets the length of the movie
     * 
     * @param time stores the time of the movie so pass to runTime.
     */
    public void setRunTime(int time){
        runTime = time; 
    }
    
    /**
     * returns the length of the movie
     * 
     * @return Returns runTime.
     */
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
    
    /**
     * sets the title of the movie
     * 
     * @param movieName stores the name of the movie to pass to title.
     */
    public void setTitle(String movieName){
        title = movieName;
    }
    
    /**
     * returns the title of the movie
     *
     * @return returns title.
     */
    public String getTitle(){
        return title;
    }
}

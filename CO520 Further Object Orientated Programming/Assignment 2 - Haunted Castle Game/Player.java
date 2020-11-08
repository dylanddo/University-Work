/**
 * Class Player
 * A single object represents the single player.
 * 
 * @author Olaf Chitil
 * @version 3/2/2020
 */

public class Player extends Character
{
    private Room goal;
    private final int TIME_LIMIT = 12;
    private int currentTime;

    /**
     * Constructor, taking start room and goal room.
     * Pre-condition: start location is not null.
     */
    public Player(Room start, Room goal)
    {
        super(start);
        this.goal = goal;
    }

    public void move(Room loc)
    //java polymorphism
    {
        super.move(loc);
        //We call the move method from the Character class and take the parameter loc.
        currentTime++;
    }

    /**
     * Check whether time limit has been reached.
     */
    public boolean isAtTimeLimit()
    {
        if(TIME_LIMIT < currentTime){
            return true;
        } 
        else
        {
            return false;
        }
        // ToDo
    }

    /**
     * Check whether goal has been reached.
     */
    public boolean isAtGoal()
    {
        if(getLocation() == goal)
        //If the current location is the same as the goal (bedroom) than return true.
        {
            return true;
            // ToDo
        } 
        else 
        {
            return false;
        }
        //Adding a Goal (10 marks)
    }

    /**
     * Return a description.
     */
    public String toString()
    {
        return "you";
        //you represents the player.
    }
}

import java.util.List;
import java.util.Collections;
import java.util.Random;

/**
 * Class Ghost
 * A ghost in the castle.
 * 
 * @author Olaf Chitil
 * @version 3/2/2020
 */

public class Ghost extends Character
{
    private String description;

    /**
     * Constructor initialising location and description.
     * Pre-condition: location not null.
     * Pre-condition: description not null.
     */
    public Ghost(Room loc, String desc)
    {
        super(loc);
        description = desc;
        //Adding Ghosts (10 marks)
    }

    /**
     * Return the description.
     */
    public String toString()
    {
        return description; // ToDo
        //Adding Ghosts (10 marks)
    }

    /**
     * Go to a random room.
     * @param rooms all rooms available
     * Pre-condition: the list is not empty.
     */
    public void goRandom(List<Room> rooms)
    {
        
        Random rand = new Random();
        int room = rand.nextInt(rooms.size());
        this.move(rooms.get(room));
        
        //rooms is from the parameter
        //An lists of different rooms and you randomly select a room to pick.
        // ToDo
    }
}

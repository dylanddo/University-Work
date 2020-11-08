import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
/**
 * Class SolidGhost
 * A solid ghost in the castle.
 * 
 * @author Olaf Chitil
 * @version 4/2/2020
 */

public class SolidGhost extends Ghost
{
    
    /**
     * Constructor initialising location and description.
     * Pre-condition: location not null.
     * Pre-condition: description not null.
     */
    public SolidGhost(Room loc, String desc)
    {
        super(loc, desc);
    }
        
    /**
     * Go to a random neighbouring room.
     * If there is no neighbour, then stay in current room.
     * @param rooms all rooms available - actually ignored
     */
    public void goRandom(List<Room> rooms)
    {
        ArrayList<Room> room = new ArrayList<Room>();
        Random rand = new Random();        
        Room currentRoom = getLocation();
        //Current location of the SolidGhost.
        
        for(Direction direct : Direction.values())
        //Type Direction. Looks at Enum for all possible directions.
        {
            if (currentRoom.getExit(direct) != null) 
            {
                room.add(currentRoom.getExit(direct));
                //Adds all possbile exits to the ArrayList.
            }
        }
        int index = rand.nextInt(room.size());
        //Generate a random integer from the range 0 to size-1.
        
        move(room.get(index));
        //Move to the room from the current index.
        
        //rooms is from the parameter
        //An lists of different rooms and you randomly select a room to pick.
        // ToDo
    }
}

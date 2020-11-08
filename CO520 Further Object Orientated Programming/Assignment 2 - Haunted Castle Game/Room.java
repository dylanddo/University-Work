import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class Room - a room in a game.
 *
 * This class is part of the "Haunted Castle" application. 
 * "Haunted Castle" is a very simple, text based travel game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Michael Kölling, David J. Barnes and Olaf Chitil
 * @version 4/2/2020
 */

public class Room 
{
    private String description;
    private HashMap<Direction, Room> exits;        // stores exits of this room.

    private ArrayList<Character> characters;
    private ArrayList<String> descriptions;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     * Pre-condition: description is not null.
     */
    public Room(String description) 
    {
        assert description != null : "Room.Room has null description";
        this.description = description;
        exits = new HashMap<Direction, Room>();
        
        characters = new ArrayList<>();
        //Not intilising this was causing the error.

        descriptions = new ArrayList<>();

        sane();
        
        this.characters = characters;
    }

    /**
     * Class invariant: getShortDescription() and getLongDescription() don't return null.
     */
    public void sane()
    {
        assert getShortDescription() != null : "Room has no short description" ;
        assert getLongDescription() != null : "Room has no long description" ;
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     * Pre-condition: neither direction nor neighbor are null; 
     * there is no room in given direction yet.
     */
    public void setExit(Direction direction, Room neighbor) 
    {
        assert direction != null : "Room.setExit gets null direction";
        assert neighbor != null : "Room.setExit gets null neighbor";
        assert getExit(direction) == null : "Room.setExit set for direction that has neighbor";
        sane();
        exits.put(direction, neighbor);
        sane();
        assert getExit(direction) == neighbor : "Room.setExit has wrong neighbor";
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        String list = "";
        if(characters.size() > 0)
        {
            list = "\nCharacters: ";
            List<String> c = characters.stream().map(Character::toString).sorted().collect(Collectors.toList());
            for(String character : c)
            {
                list += c.toString() + "; ";
            }            
        }
        return "You are " + description + ".\n" + getExitString() + list;
    }    

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        // Ensure some fixed ordering of keys, so that return String uniquely defined.
        List<String> es = exits.keySet().stream().map(Direction::toString).sorted().collect(Collectors.toList());
        for(String e : es) {
            returnString += " " + e;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     * Pre-condition: direction is not null
     */
    public Room getExit(Direction direction) 
    {
        assert direction != null : "Room.getExit has null direction";
        sane();
        return exits.get(direction);
    }

    /**
     * Add given character to the room
     * @param c The character to add.
     * Pre-condition: character is not null.
     * Pre-condition: character itself has this room as location.
     */
    public void addCharacter(Character c)
    {
        characters.add(c);
        //Adds c to ArrayList characters.
        // ToDo
    }

    /**
     * Remove given character from the room.
     * @param c The character to remove.
     * Pre-condition: character is not null.
     * Pre-condition: character itself has this room as location.
     */
    public void removeCharacter(Character c)
    {
        characters.remove(c);
        //Removes c from the ArrayList characters.
        // ToDo
    }

    /**
     * Change all exits of a room to their dual.
     */
    public void dual()
    {
        ArrayList<Direction> checkedDirections = new ArrayList<Direction>();
        //Keeps tabs on all checked directions.
        for(Direction direct : exits.keySet())
        //loops through all the exits of this room.
        //We need to get all the directions.
        {            
            if(!checkedDirections.contains(direct))
            //if statement to see if we have already swapped the rooms or not.
            {  
                Direction duel = direct.dual();
                //where we want to swap the exit to.
                Room temp = exits.get(duel);
                //stores what is in the other exit.
                setExit(duel , exits.get(direct));
                //We set the opposite direction to be the exit, completing the swap.
                checkedDirections.add(direct);
                //We check to see if there was anything in the other direction.
                if(temp != null)
                {
                    setExit(direct, temp);
                    //If there was than we swap everything.
                    checkedDirections.add(duel);
                    //We add it to the checked list.
                }
                else
                {
                    setExit(direct, null); 
                    //If there is nothing in the other direction we set our direction to null.
                }
            }
        }

        // ToDo
    }
}


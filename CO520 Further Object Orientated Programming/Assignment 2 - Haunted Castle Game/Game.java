import java.util.List;
import java.util.Arrays;

/**
 *  This class is the central class of the "Haunted Castle" application. 
 *  "Haunted Castle" is a very simple, text based game.  Users 
 *  can walk around some castle. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 * @author  Michael Kölling, David J. Barnes and Olaf Chitil
 * @version 3/2/2020
 */

public class Game 
{
    private boolean finished;
    private Player player;
    private Room[] tempRoom;
    List<Room> rooms;
    private Ghost[] tempGhost;
    List<Ghost> ghosts;

    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        finished = false;
        player = createScenario();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private Player createScenario()
    {
        Room gate, hall, greatHall, staircase, kitchen, chapel, hall2, 
        toilet, bedroom, dungeon;
        Ghost lady, headless, skeleton, jack; //Solid Ghost

        // create the rooms
        gate = new Room("at the main gate");
        hall = new Room("in the entrance hall");
        greatHall = new Room("in the great hall");
        staircase = new Room("at the staircase");
        kitchen = new Room("in the kitchen");
        chapel = new Room("in the chapel");
        hall2 = new Room("in the upper hall");
        toilet = new Room("in the toilet");
        bedroom = new Room("in the bedroom");
        dungeon = new Room("in the dungeon");
        Room[] lotsOfRooms = {gate, hall, greatHall, staircase, kitchen, chapel, hall2, toilet, bedroom, dungeon};
        rooms = Arrays.asList(lotsOfRooms);
        

        // initialise room exits
        gate.setExit(Direction.NORTH, hall);
        hall.setExit(Direction.SOUTH, gate);
        hall.setExit(Direction.NORTH, staircase);
        hall.setExit(Direction.WEST, kitchen);
        hall.setExit(Direction.EAST, greatHall);
        kitchen.setExit(Direction.EAST, hall);
        greatHall.setExit(Direction.WEST, hall);
        greatHall.setExit(Direction.SOUTH, chapel);
        chapel.setExit(Direction.NORTH, greatHall);
        staircase.setExit(Direction.SOUTH, hall);
        staircase.setExit(Direction.DOWN, dungeon);
        dungeon.setExit(Direction.UP, staircase);
        staircase.setExit(Direction.UP, hall2);
        hall2.setExit(Direction.DOWN, staircase);
        hall2.setExit(Direction.SOUTH, toilet);
        toilet.setExit(Direction.NORTH, hall2);
        hall2.setExit(Direction.WEST, bedroom);
        bedroom.setExit(Direction.EAST, hall2);
        
        lady = new Ghost(chapel, "Ghost lady");
        headless = new DualGhost(kitchen, "Headless");
        skeleton = new Ghost(hall2, "Skeleton");
        jack = new SolidGhost(toilet, "Jack");
        Ghost[] lotsOfGhosts = {lady, headless, skeleton};
        ghosts = Arrays.asList(lotsOfGhosts);
        return new Player(gate, bedroom);
        //Adding a Goal (10 marks)
        //return new Player(gate, null); was causing error when testing goGoal() in the GameTest class because the goal was...
        //set at null when it should be set at bedroom.
    }

    /**
     * Return the player object.
     */
    public Player getPlayer()
    {
        return player;
    }

    /**
     * Return whether the game has finished or not.
     */
    public boolean finished()
    {
        return finished;
    }

    /**
     * Opening message for the player.
     */
    public String welcome()
    {
        return "\nWelcome to the Haunted Castle!\n" +
        "Haunted Castle is a new game.\n" +
        player.getLocation().getLongDescription() + "\n";
    }

    // implementations of user commands:
    /**
     * Give some help information.
     */
    public String help() 
    {
        return "You are lost. You are alone. You wander around the castle.\n";
    }

    /** 
     * Try to go in one direction. If there is an exit, enter the new
     * room and return its long description; otherwise return an error message.
     * @param direction The direction in which to go.
     * Pre-condition: direction is not null.
     */
    public String goRoom(Direction direction) 
    {
        assert direction != null : "Game.goRoom gets null direction";

        // Try to leave current room.
        Room nextRoom = player.getLocation().getExit(direction);
        player.isAtTimeLimit();
        //////////////////////////
        if (nextRoom == null) {
            return "There is no exit in that direction!";
        }
        else 
        {
            player.move(nextRoom);
            
            if(player.isAtGoal()){
                return player.getLocation().getLongDescription() + "\nCongratulations! You reached the goal.\nThank you for playing.  Good bye.";
            }             
            else if(player.isAtTimeLimit())
            {
                return player.getLocation().getLongDescription() + "\nLost! You ran out of time.\nThank you for playing.  Good bye.";
                //  "\nLost! You ran out of time.\nThank you for playing.  Good bye."
            }

            else 
            {
                return player.getLocation().getLongDescription();
            }
        }
        //Adding a Goal (10 marks)
    }

    /**
     * Execute quit command.
     */
    public String quit()
    {
        finished = true;
        return "Thank you for playing.  Good bye.";
    }

    /**
     * Execute look command.
     */
    public String look()
    {
        return player.getLocation().getLongDescription();
        //This is returning a String that gets the location and description from the player class.
        //We need the player to get the location which then that room can get that long description.
        //toDo
    }
}

/**
 * A direction in the game.
 * There exist only a few different directions.
 * 
 * @author Olaf Chitil
 * @version 3/2/2020
 */
public enum Direction
{
    NORTH("north"), 

    WEST("west"),

    SOUTH("south"), 

    EAST("east"), 

    UP("up"), 

    DOWN("down");

    private String name;

    /**
     * Constructor with parameter.
     * Pre-condition: name is not null.
     */
    private Direction(String name)
    {
        assert name != null : "Direction.Direction has null name";
        this.name = name;
        assert toString().equals(name) : "Direction.Direction produces wrong toString";
    }

    /**
     * Return the direction name.
     */
    public String toString()
    {
        return name;
    }
    
    /** 
     * Return the dual (opposite) of this direction.
     */
    public Direction dual()
    {
        switch(this)
        {
            case NORTH: return SOUTH;
            case WEST: return EAST;
            case SOUTH: return NORTH;
            case EAST: return WEST;
            case UP: return DOWN;
            case DOWN: return UP;
            //We want to return the opposite enum. We don't need quatations mark e.g. "south".
        } 
        return null; // ToDo
    }
}

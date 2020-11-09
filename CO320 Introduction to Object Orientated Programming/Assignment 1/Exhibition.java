        
        /**
         * This is a class that keeps information on the 
         * number of people attending an exhibition.
         * The capacity can be specified and the user will 
         * be able to add or subtract to the occupancy.
         *
         *By Dylan Danga Dje Oleko
         */
public class Exhibition
{
    // The occupancy of the exhibition.
    private int occupancy;
    // The capacity of the exhibition entered by the user.
    private int capacity;
    // The exhibition name entered by the user. 
    private String exhibitionName;
        
    /**
    * Constructor for objects of class Exhibition.
    * Set starting occupancy at zero.
    * The capacity will be whatever number we input.
    * The exhibition name will be whatever word we 
    * input.
    */
    public Exhibition(String exhibitionName, int capacity)
    {
        occupancy = 0;
        this.capacity = capacity;
        this.exhibitionName = exhibitionName;
                
    }
    
    /**
    * Returns the current capacity.
    */
    public int getCapacity()
    {
        return capacity;
    }
    
    /**
    * Returns the current occupancy.
    */
   public int getOccupancy()
   {
       return occupancy;
   }
   
   /**
   * Returns the exhibition name.
   */
   public String getName()
   {
      return exhibitionName;
   }
            
   /**
   * This adds to the occupancy in increments of one.
   * If the occupancy is not less than the capacity then a message will be printed out telling the user that the 
   * exhibition is full.
   */
   public void attend()
   {
       if(occupancy < capacity) {
           occupancy += 1;
        } else {
            System.out.println("Error the exhibition is currently full");
        }
   }
   
   /**
   * This decreases the occupancy in increments of one.
   * If the occupancy is less than or equal to zero a message will be displayed stating that the exhibition is empty.
   */
   public void leave()
   {
       if(occupancy > 0) {
           occupancy -= 1;
        } else {
            System.out.println("Error the exhibition is currently empty");
        }
   }
   
   public void changeCapacity(int newCapacity)
   {
       if(occupancy > 0 && (capacity + newCapacity) < occupancy){
           System.out.println("Error capacity can't be changed as it would be less than the occupancy");
        }
        else if (capacity + newCapacity < 0){
            capacity = 0;
            System.out.println("The exhibition is now closed");
        }
        else{
            capacity = capacity + newCapacity;
        }
   }
   
   public boolean isSpace(int group)
   {
       if (group <= 0){
           //This checks to see if the group size is less than or equal to zero.
           return false;
        }
        
       if (occupancy + group <= capacity){
           return true;
        } else {
            System.out.println("There is no space in the exhibition for the whole group");
            return false;
            // If the occupancy and group combined exceed the capacity then a message will notify the user that there
            // isn't enough space for the whole group.
        }
   } 
}

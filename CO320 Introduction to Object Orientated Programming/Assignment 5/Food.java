/**
 * The Food class stores three variables called name, weight and glutenFree. It allows the user to create a Food object, assign 
 * it a name and weight and decide if it is gluten free or not. 
 * 
 *
 * By Dylan Danga Dje Oleko
 * 25/11/2019
 */
public class Food
{
    // instance variables
    private String name;
    private int weight;
    private boolean glutenFree;

    /**
     * Constructor for objects of class Food
     */
    public Food(String name, int weight)
    {
        // initialise instance variables
        this.name = name;
        this.weight = weight;
        glutenFree = false;
        //We are declaring glutenFree as false.
    }
    
    /**
     * Method getName returns the name the user inputs.
     */
    public String getName()
    {
        return name;
        //Accessor method - used to return/get a value.
    }
    
    /**
     * Method getWeight returns the weight the user inputs.
     */
    public int getWeight()
    {
        return weight;
        //Accessor method - used to return/get a value.
    }
    
    /**
     * Method getGlutenFree returns false.
     */
    public boolean getGlutenFree()
    {
        return glutenFree;
        //Accessor method - used to return/get a value.
    }
    
    /**
     * Method freeFrom turns glutenFree from glutenFree = false to glutenFree = true.
     *
     */
    public void freeFrom()
    {
        glutenFree = true;
        //Mutator method - used to set a value.
        //boolean glutenFree = true doesn't work. It returns false.
    }
    
    /**
     * Method getDetails calls the getName() and getWeight(). If the glutenFree = true then the first statement with 
     * "(gluten free)" is printed out. If the glutenFree = false then the second statement is printed without the 
     * "(gluten free)".
     */
    public String getDetails()
    {
        if (glutenFree){
            return (getName() + " weighs " + getWeight() + "g " + "(gluten free)");
        }else {
            return (getName() + " weighs " + getWeight() + "g");            
        }
    }
}

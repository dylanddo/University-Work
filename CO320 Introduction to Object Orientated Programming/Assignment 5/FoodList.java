import java.util.Vector;
import java.util.Iterator;

/**
 * The FoodList class makes use of the Food Class. It creates a Vector list that stores Food objects and it allows the user to 
 * print gluten free and non gluten free objects as well as remove non gluten free objects from the Vector list, adding it to a 
 * new Vector list. It also allows us to search for a matching Food object in the list.
 * 
 *
 * By Dylan Danga Dje Oleko
 * 25/11/2019
 */
public class FoodList
{
    // instance variables
    private Vector<Food> foodlist;

    public FoodList()
    {
        foodlist = new Vector<>();
    }

    /**
     * Method addFood takes a parameter of type Food and adds it to the Vector list.
     */
    public void addFood(Food x)    
    {
        foodlist.add(x);
    }

    /**
     * Method printSuitable iterates through the foodlist looking for food objects and if the object is gluten free 
     * (glutenFree = true) then it prints out the first statement which includes (gluten free). 
     * if the object is not gluten free (glutenFree = false) then it prints out the second statement which doesn't include 
     * (gluten free).
     */
    public void printSuitable()
    {   
        for(Food x : foodlist)
        //This outputs all elements in the foodlist Vector, using a "for-each" loop.
        //You use for each loop when you want to iterate through a list without making modifications.
        {
            if(x.getGlutenFree())
            {
                System.out.println(x.getName() + " weights " + x.getWeight() + "g " + "(gluten free)");
            } else {
                System.out.println(x.getName() + " weights " + x.getWeight() + "g ");
            }
            
            //Limitations of for-each loop
            //1) For-each loops are not appropriate when you want to modify the ArrayList.
            //2) For-each loops do not keep track of index. So we can not obtain ArrayList index using For-Each loop.
            //3) For-each only iterates forward over the ArrayList in single steps.
            //4) For-each cannot process two decision making statements at once.
            //5) It iterates through the entire ArrayList, we can't stop halfway through.
        }
    }   

    /**
     * Method inStock returns boolean and takes a parameter of type String. 
     * The method uses an index to iterate through the foodlist and if it finds the index that the object is stored it returns 
     * true.
     * If not the method continues to iterate through the list and if there are no matching object it returns flase.
     */
    public boolean inStock(String x)    
    {
        int index = 0;
        //Creates a local variable called index.
        Food y;
        //Creating variable called y of type Food.
        while (index < foodlist.size())
        //Error checking which makes sure index isn't bigger then the size.
        {
            y = foodlist.get(index);
            //y will be equal to the current object in the list.
            //When int index = 0, we use index numbering and go to 0 and look at the object at 0.
            //y is assigned a new value everytime we go through the while loop e.g. index will be 0, 1, 2, 3 etc.

            //We have a Vector list of Food objects and the foodlist.get(index) is essentially calling the number that object
            //... belongs to. So for example when index is 5 we are getting the Food Object at 5 and this object has the
            //... String "coco pops".

            if (y.getName().equals(x)) {
                return true;
                //If the String of the object at 0 (or any number) matches String x then we return true.
            } else {
                index++;
                //Increments through the list until it finds an object that matches Food object x.
            }
        }
        return false;
        //If it goes through the whole loop and doesn't find a match it returns true.
    }

    /**
     * Method getUnsuitable creates a new Vector called nonGlutenFree. It uses an iterator to iterate through the Food objects 
     * in the list and it calls the getGlutenFree() from the food class to verify that the object being gluten free is false. 
     * If it is false the object is added to the Vector list and removed from the previous Vector foodlist.
     */
    public Vector<Food> getUnsuitable()
    {
        Vector<Food> notGlutenFree = new Vector<>();
        //We create a new vector and takes in objects of Food that are gluten free.

        Iterator<Food> unsuitable = foodlist.iterator();
        //Create an iterator called unsuitable.
        
        Food y;

        while(unsuitable.hasNext())
        //While there is a next object in the list we continue to repeat the statement.
        {
            y = unsuitable.next();
            //Variable of type Food is assigned the value unsuitable.next() meaning each time we iterate through the foodlist
            //... and during the While loop x will be the next object in the foodlist.
            //Every time we go through the while loop x is assigned a new value.

            if(y.getGlutenFree() == false)
            //Inspects object to check if it is not gluten free.
            {
                notGlutenFree.add(y);
                //We add the objects that aren't gluten free to the new Vector.
                //The new value of x that is false is added to the new Vector.

                unsuitable.remove();
                //Removes all the non gluten free objects.
            }
        }        
        return notGlutenFree;
    }
}


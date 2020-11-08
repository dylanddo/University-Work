import java.util.*;

//www.youtube.com/watch?v=jU5ACV5MucM&list=PL27BCE863B6A864E3&index=4
//youtu.be/g_BsIuRVfvk?t=279
public class CollectionWithIterator
{
    public static void main(String args[])
    {
        String[] food = {"eggs", "bacon", "bread", "milk", "apples", "nutella"};
        List<String> list1 = new ArrayList<>();
        
        //Add array item (f) to the list.
        for(String f: food)
        {
            list1.add(f);
        }
        
        String[] fridge = {"eggs", "milk"};
        List<String> list2 = new ArrayList<>();
        
        // Add array item (f) to the list.
        for(String f: fridge)
        {
            list2.add(f);
        }
        
        
        for(int i = 0; i < list1.size(); i++)
        // Looping through the list
        {
            System.out.printf("%s ", list1.get(i));
            // System.out.printf(format, arguments);
            // %d - integers (integer decimals)
            // %f - floating-point numbers
            // %s - Strings
            // So with %s it will get all the words from the list and output it as a string. 
            // So you get eggs milk and not [eggs, milk]
        }
        
        editList(list1, list2); // Calls method with list1 and list2 being the parameters.
        System.out.println();
        
        for(int i = 0; i < list1.size(); i++)
        // Looping through the list
        {
            System.out.printf("%s ", list1.get(i));
        }
    }
    
    public static void editList(Collection<String> l1, Collection<String> l2)
    {
        // An Iterator goes through each list item by item.
        // A reason to use an iterator is to REMOVE STUFF WHILST GOING THROUGH THE LOOP.
        
        Iterator<String> it = l1.iterator(); // Loops through list1
        while(it.hasNext()) // While there is a next item 
        {
            if(l2.contains(it.next())) 
            // We iterator through list1 and if list2 contains any item from list1 we remove it from list1.
            {
                it.remove();
            }
        }
    }
}

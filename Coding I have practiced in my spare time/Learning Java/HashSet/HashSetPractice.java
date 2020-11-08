import java.util.*;

// HashSet can include duplicate items unlike a Set.
// Takes a collection in a list and remove a dupilicate then it returns a new collection.
public class HashSetPractice
{
   public static void main(String args[])
    {
        String[] things = {"apple", "bob", "ham", "bob", "bacon"};
        List<String> list = Arrays.asList(things); // Converts Array into List.
        
        System.out.printf("%s", list);
        System.out.println();
        
        Set<String> set = new HashSet<String>(list); // The constructor takes the list that we want to turn into a Set.
        // Creating the HashSet removes the 2nd instance of bob so that it has 4 unique elements.
        System.out.printf("%s", set);
    }
}

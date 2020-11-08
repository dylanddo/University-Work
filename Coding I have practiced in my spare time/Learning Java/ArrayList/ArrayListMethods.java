import java.util.List;
import java.util.ArrayList;

public class ArrayListMethods
{
    public static void main(String[] args)
    {
        List<Integer> grades = new ArrayList<Integer>();
        // On the left we made grades general, we are using some type of list.
        // On the right we specify what type of list we are using which is an ArrayList.
        // List<Integer> grades is an interface.
        // ArrayList<Integer>() is an implementation which we can easily switch out.
        
        grades.add(5);
        grades.add(10);
        grades.add(1, 7); // This adds 7 to index 1 and 10 will be shifted to index 2.
        grades.add(9);
        
        System.out.println(grades.get(0));  // Gets value at index.
        
        System.out.println(grades.indexOf(7));  // Gets index of value.
        System.out.println(grades.indexOf(70));  // If we pass something thst doesn't exist we get negative 1.
        
        System.out.println(grades.contains(7)); // Returns a boolean.
        
        
        System.out.println(grades.isEmpty());   // Checks if there is anything in the list.
        
        if(!grades.isEmpty())   // While grades is NOT empty
        {
            System.out.println(grades.get(0));
        }
        
        while(!grades.isEmpty())   // While grades is NOT empty
        {
            System.out.println(grades.remove(0));
        }
        
        
       // grades.remove(3); // Removes index from list. ????????????????
        
        grades.clear(); // Clears list.
        
        for(Integer g: grades)
        {
            System.out.println(grades.get(g));
        }
    }
}

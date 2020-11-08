import java.util.*;
// One generic method that can take different types of data types, rather than having loads of overload method.
// We need a method that we can use for both String and numbers
// We can use CompareTo
public class GenericMethodReturnTypes
{
    public static void main(String[] args)
    {
        System.out.print(max(23, 42, 1));    
        System.out.println(); 
        System.out.print(max("apples", "tots", "chicken"));   
    }
    
    //generic method
    // generic form of data called T
    // max is the method name
    public static <T extends Comparable<T>> T max(T a, T b, T c)
    {
        T maximum = a; // Start by assuming a is the greatest
        
        if(b.compareTo(a) > 0)
        // Returns a negative number, 0 or a postive number
        {
            maximum = b; // Sets b as the new maximum
        } 
        
        if(c.compareTo(maximum) > 0)
        {
            maximum = c; // Sets c as the new maximum
        }
        
        return maximum;
    }
}

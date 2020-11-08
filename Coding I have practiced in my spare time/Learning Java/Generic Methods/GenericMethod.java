import java.util.*;
// One generic method that can take different types of data types, rather than having loads of overload method.
public class GenericMethod
{
    public static void main(String[] args)
    {
        Integer[] numbers = {1, 2 ,3 ,4};
        Character[] letters = {'d', 'y', 'l', 'a', 'n'};
        
        printMe(numbers);
        printMe(letters);       
    }
    
    //generic method
    // generic form of data called T
    // T is a generic Array.
    public static <T> void printMe(T[] x)
    {
        for(T d: x)
        { 
            System.out.printf("%s ", d);
        }        
        System.out.println();
    }
}

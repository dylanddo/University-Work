import java.util.*;

public class OverloadMethod
{
    public static void main(String[] args)
    {
        Integer[] numbers = {1, 2 ,3 ,4};
        Character[] letters = {'d', 'y', 'l', 'a', 'n'};
        
        printMe(numbers);
        printMe(letters);       
    }
    
    public static void printMe(Integer[] i)
    {
        for(Integer x: i)
        { 
            System.out.printf("%s ", x);
        }        
        System.out.println();
    }
    
    public static void printMe(Character[] i)
    {
        for(Character x: i)
        { 
            System.out.printf("%s ", x);
        }        
        System.out.println();
    }
}

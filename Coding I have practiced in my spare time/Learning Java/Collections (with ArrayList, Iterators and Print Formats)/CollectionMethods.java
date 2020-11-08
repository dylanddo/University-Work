import java.util.*;
public class CollectionMethods
{
    public static void main(String[] args)
    {

        String[] crap = {"apples", "lemons", "greese", "bacon", "youtube"};
        List<String> list = Arrays.asList(crap); 
        // This allows stuff to be printed out as a list, for example...
        // [apples, bacon, greese, lemons, youtube]
        // [youtube, lemons, greese, bacon, apples]
        
        Collections.sort(list);       
        System.out.printf("%s\n", list);        
        
        Collections.sort(list, Collections.reverseOrder()); 
        // Overload method so we can pass 1 or 2 parameters. The 2nd parameter is used to tell how to sort the collection.
        System.out.printf("%s\n", list);
        
        Collections.reverse(list); 
        // Also reverse the order like Collections.sort(list, Collections.reverseOrder()); 
        System.out.printf("%s\n", list);
    }
    
    public static void otherPrintMethod()
    {

        String[] crap = {"apples", "lemons", "greese", "bacon", "youtube"};
        //With System.out.println(crap) you get this  [Ljava.lang.String;@24db80b7 (a boolean)
        for(String c: crap)
        {
            System.out.printf("%s\n", c);
            // This will convert all items in the Array crap to a String ("%s") and the \n is used to create a new line each
            // ... time we go through the for loop.
        }
    }
}

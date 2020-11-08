import java.util.*;

// The list inherits all the methods from collections when we call the collection class.
public class AddAll
{
    public static void main(String[] args)
    {
        String[] stuff = {"apples", "lemons", "greese", "bacon"};
        List<String> list1 = Arrays.asList(stuff);   
        
        ArrayList<String> list2 = new ArrayList<>();  
        list2.add("youtube");
        list2.add("google");
        list2.add("reddit");
        
        for(String x: list2)
        {
            System.out.printf("%s ", x);
            //System.out.println(x);
        }
        
        Collections.addAll(list2, stuff);
        // Takes all the elements from stuff and adds it to list2.
        
        System.out.println();
        for(String x: list2)
        {
            System.out.printf("%s ", x);
            //System.out.println(x);
        }
    }
}

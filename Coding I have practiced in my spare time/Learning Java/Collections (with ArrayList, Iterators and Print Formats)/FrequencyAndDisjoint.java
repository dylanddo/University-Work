import java.util.*;

// Frequency method checks one list against the other or one list against a term or element and if it appears in a list it
// ... outputs how many times it appears in the list.

// Disjoint checks one collection against another and returns true if they have no elements in common.
public class FrequencyAndDisjoint
{
    public static void main(String[] args)
    {
        String[] stuff = {"apples", "lemons", "greese", "bacon", "digg"};
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
        System.out.println();
        
        //freqency
        System.out.println(Collections.frequency(list2, "digg"));
        // This goes through list2 and checks if "digg" is in it
        // It will display one
        
        
        //disjoint
        boolean TrueOrFalse = Collections.disjoint(list1, list2);
        if(TrueOrFalse)
        {
            System.out.println("list1 and list2 have nothing in common.");
        }
        else
        {
            System.out.println("list1 and list2 have something in common.");
        }        
    }
}

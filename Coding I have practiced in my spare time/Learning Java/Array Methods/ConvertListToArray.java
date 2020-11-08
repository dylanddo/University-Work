import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertListToArray
{
    public static void main(String[] args)
    {
        List<Integer> grades = Arrays.asList(1, 2, 3, 4, 5);    // Converts Array to a list.
        int[] arr = new int[grades.size()];
        
        for(int i = 0; i < grades.size(); i++)
        {
            arr[i] = grades.get(i);
        }
        
        System.out.println(Arrays.toString(arr)); 
    }

    public static void main2()
    {
        String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(stuff));
        // Arrays.asList takes what array you want to treat as a list.
        // This allows use to use list and collections methods on an array.
        // LinkedList constructor only takes a list or collection so that is why we use Arrays.asList()

        
        list.add("pumpkin");
        list.addFirst("first"); // addFirst() is a LinkedList method and adds to beggining of the Array.

        
        //Convert back to an Array.
        stuff = list.toArray(new String[list.size()]);  //toArray() takes the list and convert it to an array.

        for(String x: stuff)
        {
            System.out.printf("%s ", x);
        }
    }
}
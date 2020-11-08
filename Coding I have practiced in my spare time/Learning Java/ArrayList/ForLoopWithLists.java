import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ForLoopWithLists
{
    public static void main(String[] args)
    {
        Integer[] g = {1, 2, 3, 4, 5};
        List<Integer> grades = Arrays.asList(g);    // Converts Array to a list.
        
        for(int i = 0; i < grades.size(); i++)
        {
            grades.set(i, grades.get(i) * 2);   // We pass the index and get the value and multiple by 2.
            // grades.set(index, element); 
            System.out.println(grades.get(i));
        }
    }
}

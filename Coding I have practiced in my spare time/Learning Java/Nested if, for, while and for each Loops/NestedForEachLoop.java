import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NestedForEachLoop
{
    public static void main(String[] args)
    {
        List<List<Integer>> allGrades = new ArrayList<List<Integer>>(); 
        //This list will contain numerous list of type integer.        
        
        allGrades.add(Arrays.asList(1, 2, 3, 4, 5)); 
        allGrades.add(Arrays.asList(6, 7, 8, 9, 10));   
        allGrades.add(Arrays.asList(11, 12, 13, 14, 15));   
        // Arrays.asList() converts Array to a list.
        
        // allGrades contains list of type integer.
        for(List<Integer> g: allGrades)
        {
            for(int grade: g)
            {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
    }
}
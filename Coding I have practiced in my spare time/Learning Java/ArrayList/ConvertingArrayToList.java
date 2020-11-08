import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArrayToList
{
    public static void main(String[] args)
    {
        Integer[] g = {1, 2, 3, 4, 5};
        List<Integer> grades = Arrays.asList(g);    // Converts Array to a list.
        
        System.out.println(Arrays.toString(grades.toArray()));  // We need to convert grades back to an Array inorder to use Arrays.toString()
    }
}

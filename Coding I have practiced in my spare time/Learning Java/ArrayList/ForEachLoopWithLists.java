import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ForEachLoopWithLists
{
    public static void main(String[] args)
    {
        List<Integer> grades = Arrays.asList(1, 2, 3, 4, 5);    // Converts Array to a list.

        for(int g: grades)
        {
            System.out.println(g);
        }
    }
}
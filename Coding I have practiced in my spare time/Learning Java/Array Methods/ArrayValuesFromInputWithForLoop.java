import java.util.Arrays;
import java.util.Scanner;

public class ArrayValuesFromInputWithForLoop
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] grades = new int[arraySize];
        // int[] grades = new int[10];
        
        
        for(int i = 0; i < arraySize; i++)
        // for(int i = 0; i < 10; i++)
        {
            grades[i] = scan.nextInt(); // Each time we go through the for loop this will reference each position in the array each iteration.
            // grades[i] = 5; // All numbers will be 5.
        }
        
        System.out.print(Arrays.toString(grades) + "\n");        
        
        // Another way to print array instead of using Arrays.toString(grades)
        for(int i = 0; i < grades.length; i++)
        {
            System.out.println(grades[i]);
        }
    }
}

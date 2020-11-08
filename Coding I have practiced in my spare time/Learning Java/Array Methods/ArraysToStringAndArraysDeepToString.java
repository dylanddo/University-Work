import java.util.Arrays;

public class ArraysToStringAndArraysDeepToString
{
    public static void main(String[] args)
    {
        int firstArray[] ={8, 9, 10, 11, 12, 13, 14, 15};
        
        System.out.println(Arrays.toString(firstArray));
        
        
        int secondArray[][] = 
            {
                {8, 9, 10, 11}, 
                {12, 13, 14, 15}
            };
            
        System.out.println(Arrays.deepToString(secondArray));   // Arrays.deepToString() is for multidimensional arrays.
    }
}

import java.util.Arrays;

public class ArraysSortAndArraysParallelSort
{
    public static void main(String[] args)
    {
        int[] numbers1 ={4, 3, 5, 1, 2};
        Arrays.sort(numbers1);        
        System.out.println(Arrays.toString(numbers1));
        
        int[] numbers2 ={4, 3, 5, 1, 2};
        Arrays.parallelSort(numbers2);  // You get exact same output. This is more useful for large arrays.        
        System.out.println(Arrays.toString(numbers2));
    }
}

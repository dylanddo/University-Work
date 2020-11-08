public class SearchAnArrayWithForLoop
{
    public static void main(String[] args)
    {
        int[] numbers ={1, 2 ,3};
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == 2)
            {
                System.out.println("Found at index: " + i);
            }
        }
    }
}

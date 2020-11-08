public class SummingElementsOfArrays
{
    public static void main(String[] args)
    {
        int[] numbers = {49, 44, 19, 18, 15, 10, 6};
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        System.out.println("Sum of the numbers in an array the: " + sum);
    }
}

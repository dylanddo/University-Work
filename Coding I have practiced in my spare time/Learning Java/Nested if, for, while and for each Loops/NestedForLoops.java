public class NestedForLoops
{
    public static void main(String[] args)
    {
        for(int i = 9; i >= 0; i--)
        // Counting down from 9 all the way to 0
        // This happens 10 times, 1 time for each iteration of this outer for loop.
        // This loop does the rows.
        // There are 10 rows.
        {
            //for(int k = 9; k >= 0; k--)
            for(int k = i; k >= 0; k--)
            // i starts at 9 then it shrinks down to 8, then 7 and so on..
            // Doing int k = i allows us to get the triangle shape.
            // With iteration we are going to output the number
            // This loop does columns
            // There are 10 columns.
            // The length of the row and column decrease because the starting number (k) decreases  for example going from 9 to 8.
            // This means there is less numbers between the starting number and 0.
            {
                System.out.print(k + " ");
                // Don't use println
            }
            System.out.println();
            // We get 10 iterations of 10 iterations.
        }
    }
}

public class NestedWhileLoop
{
    public static void main(String[] args)
    {
        /* 
           for(int i = 9; i >= 0; i--)
           // The i >= 0 means WHILE i is more than or equal to 0 (the condition).
           // i-- is decremenet operator (the update).
           {
                for(int k = i; k >= 0; k--)
                // The k >= 0 means WHILE k is more than or equal to 0.
                {
                    System.out.print(k + " ");
                }
                System.out.println();
           }
        */
       
       
       
        // We can do the for loop in the form of a while loop.
        // It will be the same as the for loop just structurely different.
        
        int i = 9;
        while(i >= 0)   // The condition goes in the while loop.
        {
            int k = i;
            
            while(k >= 0)   // The condition goes in the while loop.
            {
                System.out.print(k + " ");
                k--;    // The update in this case the decrement operator always happens at the end.
            }
            
            System.out.println();
            i--;    // The update in this case the decrement operator always happens at the end.
        }
    }
}

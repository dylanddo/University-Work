// Recursion is a method that calls itself until it gets to a base case and when it does it can solve the problem.
// https://youtu.be/fpuWkZs51aM?t=303
// Using factorials.
// Factorial for 5 is essentially 5 x 4 x 3 x 2 x 1. 
// So 1 will be our base case.
// Recursion needs to know when to stop it doesn't go on for a infinite amount of time.

public class Recursion
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        //sayHi();
    }
    
    public static long factorial(long n)
    {
        if(n <= 1)
        {
            return 1;   // Base case (need it so we don't go in an infinite loop)
        }
        
        else
        {
            return n * factorial(n-1);   // fact(n-1) keeps calling the method until we reach 1 (when n is here is 2 for fact(2-1))
            // First pass 5 in
            // It goes to the else statement since n is bigger than 1.
            // We return...
            // 5!
            // 5 x 4!      5 x (5-1)
            // 4 x 3!      4 x (4-1)
            // 3 x 2!      3 x (3-1)
            // 2 x 1!      2 x (2-1)
            // 1!
            // We stop once we get to 1 and this returns 1.
            // We have reached the base of this method.

            // Once we return one the method works its way up. (Starting from 1!)
            // 5! <--- 120 
            // 5 x 4! <--- 120 
            // 4 x 3! <--- 24 
            // 3 x 2! <--- 6 
            // 2 x 1! <--- 2 
            // 1! <--- 1 

            // Method tries to solve itself and it stores what it doesn't know in memory.
        }
    }

    public static void sayHi()
    {
        for(int i = 0; i <= 10; i++)
        {
          System.out.println("Hello there");  
        }       

    }
}
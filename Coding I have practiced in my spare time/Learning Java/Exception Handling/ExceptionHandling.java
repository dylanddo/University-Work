import java.util.*;

// Errors and exceptions are the exact same thing.
// When a user does something they're not supposed to do we don't want to get an error because the program 
// ...will stop running/shutdown,
// ...we want to tell the user they're wrong and tell them to fix they're mistake.

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean correctInput = false;  // Used to check if input is 0;
        // Alternative...
        // int x = 1;

        do
        // This will continue to keep running this code while x is still equal to 1.
        // If the user is successful in their input x will be set to 2 meaning the program will shutdown without having to
        // ...use the exception.
        {
            try{
                System.out.println("Enter the first number: ");
                double n1 = scan.nextInt();

                System.out.println("Enter the second number: ");
                double n2 = scan.nextInt();

                double result = n1/n2;
                System.out.println("Result: " + result + "\n");

                correctInput = true; 
                // If the correct input (not 0) is given, correctInput is set to true and the program shuts down
                // Alternative...
                // x = 2;
                // Once x is equal to 2 the program shutdowns.
            }
            catch(Exception e)
            // Exception e catches all errors.
            {
                System.out.println("You can't divide by 0!\n"); 
            }
            // try a bit of code and if you have an error instead of shutting down the program you try and catch the error and do
            // ...something with it.
        } while (!correctInput);    // While correctInput is not true (false)
        // While statement default is true.
        // Alternative...
        // while (x == 1);
    }
}


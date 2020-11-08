import java.util.Random;

// Methods for Random works similarly to Scanner e.g. nextInt.

public class RandomPractice
{
    public static void main(String[] args)
    {
        Random dice = new Random(); 
        
        int number;
        
        // Rolling dice 10 times.
        for(int i = 1; i <=10; i++)
        {
             // number = dice.nextInt(6); // This outputs numbers between 0 and 5.             
                                     
             // number = dice.nextInt((6 - 1) + 1) + 1; // Also outputs numbers between 1 and 6
             // random.nextInt(max - min + 1) + min
             
             number = 1 + dice.nextInt(6); // This outputs numbers between 1 and 6
             
             System.out.println("Number on dice: " + number);
        }
    }
}

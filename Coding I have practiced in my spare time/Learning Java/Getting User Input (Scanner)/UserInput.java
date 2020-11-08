import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int counter = 0;
        System.out.println("Please enter 5 numbers");
        while(counter < 5)
        {
            int numbers = scan.nextInt();
            counter++;
        }
    }
}

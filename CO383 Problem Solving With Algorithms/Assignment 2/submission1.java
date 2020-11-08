import java.util.Scanner;

public class submission1
{    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double a = 1;
        double N = input.nextDouble();
        while(Math.abs(a - N/a) >= 0.00000000000001)
        //We use the Math.abs method.
        //Change the 1 from the lecture slide to 0.01 here in the code.
        {
            a = (a + N/a)/2;
        }
        System.out.println((int) a);
    }
}

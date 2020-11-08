import javax.swing.*;
import java.awt.*;

// JOptionPane is used to make a simple graphical user interface that can be interacted with.

public class PracticingJOptionPane
{
    public static void main(String[] args)
    {
        String firstNumber = JOptionPane.showInputDialog("Enter first number");        
        String secondNumber = JOptionPane.showInputDialog("Enter second number");
        
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        
        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Answer", JOptionPane.PLAIN_MESSAGE);
        // This method takes 4 parameters.
        // The 1st parameter is position and if you put null it will put the box in the middile of the screen.
        // The 2nd parameter is the message you want to display.
        // The 3rd parameter is what appears on the title bar.
        // The 4th parameter is the message that pops up.
    }
}

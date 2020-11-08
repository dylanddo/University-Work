import javax.swing.*;

public class Main 
{
    public static void main(String[] args)    
    {
        GUI g = new  GUI();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Ends program when X button is clicked.
        g.setSize(350, 200);    // Sets the size of the window.
        g.setVisible(true); // Makes it visible.
    }
}

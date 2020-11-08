import javax.swing.JFrame;

public class MainJButton
{
    public static void main(String[] args)
    {
        PracticingJButton e = new  PracticingJButton();
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Ends program when X button is clicked.
        e.setSize(350, 200);    // Sets the size of the window.
        e.setVisible(true); // Makes it visible.
    }
}
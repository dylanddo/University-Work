import javax.swing.JFrame;

public class MainJList
{
    public static void main(String[] args)
    {
        PracticingJList e = new  PracticingJList();
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Ends program when X button is clicked.
        e.setSize(300, 500);    // Sets the size of the window.
        e.setVisible(true); // Makes it visible.
    }
}

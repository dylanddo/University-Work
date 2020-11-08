import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame
// Extends JFrame means that GUI inheriance all JFrame methods
// Also means instead of having to type stuff like frame.add(label) we can just type frame.add(label)
{
    private JLabel label;
    
    public GUI()    // We treat the constuctor as a method.
    {
        super("The title bar");
        setLayout(new FlowLayout()); // Default layout
        
        label = new JLabel("This is a sentence!");
        label.setToolTipText("This is going to show up on hover");  // This shows hover text.
        add(label);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticingJButton extends JFrame
// Extends JFrame means that PracticingJButton inheriance all JFrame methods
// Also means instead of having to type stuff like frame.add(label) we can just type frame.add(label)
{
    private JButton reg, custom;

    public PracticingJButton()    // We treat the constuctor as a method.
    {
        super("Title"); // Calls method from the super class JFrame/
        setLayout(new FlowLayout()); // Default layout

        reg = new JButton("Regular");
        add(reg);       

        Icon a = new ImageIcon(getClass().getResource("Windows.png"));   
        Icon b = new ImageIcon(getClass().getResource("Windows2.png")); 
        custom = new JButton("Start", a);   // The second button adds the picture to the button.  
        custom.setRolloverIcon(b);
        add(custom);

        HandlerClass handler = new HandlerClass();  // Builds an actionListener object.
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }

    // A class inside a class inherits everything from the main class.
    private class HandlerClass implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        // Built in method from the ActionListener Class.
        {
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}

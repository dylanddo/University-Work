import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticingJCheckBox extends JFrame
// Extends JFrame means that PracticingJCheckBox inheriance all JFrame methods
// Also means instead of having to type stuff like frame.add(label) we can just type frame.add(label)
{
    private JTextField textField;
    private JCheckBox boldBox, italicBox;

    public PracticingJCheckBox()    // We treat the constuctor as a method.
    {
        super("Title"); // Calls method from the super class JFrame
        setLayout(new FlowLayout()); // Default layout

        textField = new JTextField("This is a sentence", 20);   // Size is 20
        textField.setFont(new Font("Serif", Font.PLAIN, 14));   // Font family is Serif, font type is plain and size is 14
        add(textField);

        boldBox = new JCheckBox("Bold");
        italicBox = new JCheckBox("Italic");
        add(boldBox);
        add(italicBox);
        
        
        
        // HandlerClass handler = new HandlerClass();  Instead of doing this like we did in PracticingJButton we can just let addItemListener take in the HandlerClass as
        // ...a parameter.
        // Waits for the boxes to be clicked.
        boldBox.addItemListener(new HandlerClass());
        italicBox.addItemListener(new HandlerClass());
    }

    // A class inside a class inherits everything from the main class.
    private class HandlerClass implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        // Built in method from the ItemListener Class.
        // Each time the checkbox is clicked an event occurs.
        {
            Font font = null;

            if(boldBox.isSelected() && italicBox.isSelected())
            // isSelected() is an ItemListener method.
            {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            }
            else if(boldBox.isSelected())
            {
                font = new Font("Serif", Font.BOLD, 14);
            }
            else if(italicBox.isSelected())
            {
                font = new Font("Serif", Font.ITALIC, 14);
            }
            else
            {
                font = new Font("Serif", Font.PLAIN, 14);
            }
            
            textField.setFont(font); // Once all of thew above is executed the textField font is changed.
        }
    }
}

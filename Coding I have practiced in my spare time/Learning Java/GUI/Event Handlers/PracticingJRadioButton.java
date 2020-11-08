import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// https://www.youtube.com/watch?v=-ptlsT9KsM8&list=PLFE2CE09D83EE3E28&index=67


public class PracticingJRadioButton extends JFrame
// Extends JFrame means that PracticingJRadioButton inheriance all JFrame methods
// Also means instead of having to type stuff like frame.add(label) we can just type frame.add(label)
{
    private JTextField textField;
    private Font plain, bold, italic, boldAndItalic;
    private JRadioButton plainButton, boldButton, italicButton, boldAndItalicButton;
    private ButtonGroup group;  // Establishes a relationship so that only 1 radio button can be selected at a time.

    public PracticingJRadioButton()    // We treat the constuctor as a method.
    {
        super("Title"); // Calls method from the super class JFrame
        setLayout(new FlowLayout()); // Default layout

        textField = new JTextField("This is a sentence", 20);   // Size is 20
        textField.setFont(new Font("Serif", Font.PLAIN, 14));   // We need to set textField to a font by default
        add(textField);
        
        
        // Now we add the radio buttons.
        plainButton = new JRadioButton("Plain", true);  // True is checked and false is unchecked. We can only have one true at a time.
        boldButton = new JRadioButton("Bold", false);
        italicButton = new JRadioButton("Italic", false);
        boldAndItalicButton = new JRadioButton("Bold and Italic", false);
        add(plainButton);
        add(boldButton);
        add(italicButton);
        add(boldAndItalicButton);
        
        
        // Now we add all the radio buttons to the group.
        // We group them so they know when each other is checked and unchecked, that way when 1 radio button is checked the others can't be checked.
        group = new ButtonGroup();
        group.add(plainButton);
        group.add(boldButton);
        group.add(italicButton);
        group.add(boldAndItalicButton);
        
        
        plain = new Font("Serif", Font.PLAIN, 14); 
        bold = new Font("Serif", Font.BOLD, 14);
        italic = new Font("Serif",Font.ITALIC, 14);
        boldAndItalic = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        
        
        // ItemListener is added to each radio button so the porogram can wait for it to be clicked.
        // Takes the HandlerClass as a parameter and passes in the font object to the constructor of the HandlerClass. 
        plainButton.addItemListener(new HandlerClass(plain));   
        boldButton.addItemListener(new HandlerClass(bold));
        italicButton.addItemListener(new HandlerClass(italic));
        boldAndItalicButton.addItemListener(new HandlerClass(boldAndItalic));
    }

    // A class inside a class inherits everything from the main class.
    private class HandlerClass implements ItemListener
    {
        private Font font;
        
        public HandlerClass(Font f)
        // Constuctor takes a font object as an arguement.
        {
            font = f;
        }
        
        //Sets the font to the font object that was passed in
        public void itemStateChanged(ItemEvent event)
        // Built in method from the ItemListener Class.
        // Each time the radio button is clicked an event occurs.
        {
            textField.setFont(font); 
        }
    }
}

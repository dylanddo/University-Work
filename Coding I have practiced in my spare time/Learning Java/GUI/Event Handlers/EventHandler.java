import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class EventHandler extends JFrame
{
    private JTextField textField1, textField2, textField3;
    private JPasswordField passwordField;
    
    public EventHandler()
    {
        super("Tile");  // Sets title
        setLayout(new FlowLayout());
        
        textField1 = new JTextField(10); // Sets size to 10 characters.
        add(textField1);
        
        textField2 = new JTextField("Enter text here"); // Sets size to 10 characters.
        add(textField2);
        
        textField3 = new JTextField("Uneditable", 20); // Sets size to 10 characters.
        textField3.setEditable(false);  // The user won't be able to edit text field.
        add(textField3);
        
        passwordField = new JPasswordField("Password");
        add(passwordField);
        
        HandlerClass handler = new HandlerClass();  // Builds an actionListener object.
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    
    // A class inside a class inherits everything from the main class.
    private class HandlerClass implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        // Built in method from the ActionListener Class.
        {
            String s = "";
            
            if(event.getSource() == textField1)
            // event will be an enter or a click.
            // Source means where it happens.
            // If they clicked enter on textField1 then we do...
            
            {
                s = String.format("Field 1: %s", event.getActionCommand());
                // event.getActionCommand() gets the text in textField1.
                // For example if I put Dylan in textField one then what will be displayed is "Field 1: Dylan".
            }
            else if(event.getSource() == textField2)
            {
                s = String.format("Field 2: %s", event.getActionCommand());
            }
            else if(event.getSource() == textField3)
            {
                s = String.format("Field 3: %s", event.getActionCommand());
            }
            else if(event.getSource() == passwordField)
            {
                s = String.format("Password field is: %s", event.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null, s);
        }
    }
}

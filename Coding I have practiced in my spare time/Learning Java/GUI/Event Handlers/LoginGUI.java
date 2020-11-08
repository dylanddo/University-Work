import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI implements ActionListener
{
    private static JLabel userLabel, passwordLabel, successLabel;
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton button;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();    // The window        
        frame.setTitle("Login");
        frame.setSize(350, 200);    // Sets the window size when it opens (width by height).
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Closes program when we click x button.
                
        JPanel panel = new JPanel();     
        frame.add(panel);
        
        panel.setLayout(null);        
        
        
        userLabel = new JLabel("User");  // This is the text next to the text field.   
        userLabel.setBounds(10, 20, 80, 25); // userLabel.setBounds(x, y, width, height);   so we go 10 to the right and 20 down with width 80px and height 25px.
        panel.add(userLabel);
        
        userText = new JTextField(); // Allows for user input.
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        
        passwordLabel = new JLabel("Password");  // This is the text next to the text field.   
        passwordLabel.setBounds(10, 50, 80, 25);    // We go 10 to the right and 50 down with width 80px and height 25px.
        panel.add(passwordLabel);
        
        passwordText = new JPasswordField(); // Allows for user input.
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        
        
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new LoginGUI()); // This needs to check in a new LoginGUI object
        panel.add(button);
        
        successLabel = new JLabel(""); // Sucessful login messgae will show when user types in correct info.
        successLabel.setBounds(10, 110, 300, 25);
        panel.add(successLabel);
        
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String user = userText.getText();
        String password = passwordText.getText();       
        
        if(user.equals("Dylan") && password.equals("Danga"))
        {
            successLabel.setText("Login successful!");  // Changes text in label from an empty string to Login Successful!
        } 
        else
        {
            successLabel.setText("User name or password is incorrect!"); 
        }
        
        // System.out.println(user + ", " + password);
        // System.out.println("Button Clicked");
    }
}

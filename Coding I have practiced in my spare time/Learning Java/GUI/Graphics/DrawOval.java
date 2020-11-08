import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawOval extends JPanel
{
    private int d = 10; // diameter of 10
    
    // paintComponent is a built in method.
    // Graphics g used to set the colour.
    public void paintComponent(Graphics g)  // Can't draw without Graphic object.
    {
        super.paintComponent(g);
        
        // Paints circle on screen.
        g.setColor(Color.BLACK);
        g.fillOval(10, 10, d, d);    // d will be 10 which will be the default, this can change with the slider.
    }
    
    // Making sure d is not a negative number.
    public void setD(int newD)
    {
        d = (newD >= 0 ? newD : 10);    
        // ? newD assigns newD to d,
        // : 10 means else assign 10 to d.
        // Another way of doing an if and else statement.
        
        repaint();  // Automatically calls the paintComponent() method.
    }
    
    // Housekeeping method.
    public Dimension getPreferredSize()
    {
        return new Dimension(200, 200);
    }
    
    // Housekeeping method.
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
}

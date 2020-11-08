import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class  DrawingGraphics extends JPanel
{
    // paintComponent is a built in method.
    // Graphics g used to set the colour.
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        // In order to draw on the screen we need to tell the graphic object what colour we want to use to draw with.
        
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);    // g.fillRect(_x_, _y_, _width_, _height_); draws rectangle. x and y is the coordinates.
                
        g.setColor(new Color(190, 81, 215));    // g.setColor(new Color(r, g, b));
        g.fillRect(25, 65, 100, 30);  
        
        
        // We can also draw text on the screen.
        
        g.setColor(Color.RED);
        g.drawString("This is some text!", 25, 120);   // g.drawString(_str_, _x_, _y_) first parameter takes in a string, x and y is the coordinates.
    }
}

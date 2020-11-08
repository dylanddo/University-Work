import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingMoreGraphics extends JPanel
{
    // paintComponent is a built in method.
    // Graphics g used to set the colour.
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        // In order to draw on the screen we need to tell the graphic object what colour we want to use to draw with.

        g.setColor(Color.BLUE);
        g.drawLine(10, 25, 200, 45);    // g.drawLine(_x1_, _y1_, _x2_, _y2_)   In order to draw a line you need 2 coordinates.

        g.setColor(Color.RED);
        g.drawRect(10, 55, 100, 30); // Unlike fillRect, drawRect draws an empty rectriangle so the retraingle is just the outline.

        g.setColor(Color.GREEN);
        g.fillOval(10, 110, 100, 30);    // Same size as a rectriangle.

        g.setColor(Color.ORANGE);
        g.fill3DRect(10, 160, 100, 50, true);    // g.fill3DRect(_x_, _y_, _width_, _height_, _raised_) raised gives it the 3D look.
    }
}

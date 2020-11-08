import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventHandling extends JFrame
{
    private JPanel mousePanel;
    private JLabel status;

    public MouseEventHandling()
    {
        super("Mouse Events");
        //setLayout(new FlowLayout());  We are using BorderLayout instead.

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);    // BorderLayout.CENTER makes the panel appear in the centre of the screen.

        status = new JLabel("Default");
        add(status, BorderLayout.SOUTH);  // BorderLayout.SOUTH makes the label appear at the bottom of the screen.  

        Handlerclass handler = new Handlerclass();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class Handlerclass implements MouseListener, MouseMotionListener
    {
        // https://www.javatpoint.com/java-mouselistener

        // When you press and release the mouse really quick.
        public void mouseClicked(MouseEvent e) 
        {
            status.setText(String.format("Clicked at %d,%d", e.getX(), e.getY()));
            // e.getX(), e.getY() gets the x and y coordinate of where the mouse click occured.
        }  

        // When mouse enters the window (mousePanel).
        public void mouseEntered(MouseEvent e) 
        {  
            status.setText("You enetered the window!");
            mousePanel.setBackground(Color.RED);
        }  

        // When the mouse leaves the window (mousePanel).
        public void mouseExited(MouseEvent e) 
        { 
            status.setText("You left the window!");            
            mousePanel.setBackground(Color.WHITE);
        }  

        // What happens when you press down mouse button.
        public void mousePressed(MouseEvent e) 
        {  
            status.setText("You pressed down the mouse!");
        }  

        // When you release the mouse button.
        public void mouseReleased(MouseEvent e) 
        {      
            status.setText("You released the button!");
        }

        
        // https://www.javatpoint.com/java-mousemotionlistener
        
        // When user drags the mouse.
        public void mouseDragged(MouseEvent e) 
        {    
            status.setText("You are dragging the mouse!");
        }  
        
        // Not holding down any buttons
        public void mouseMoved(MouseEvent e) 
        {
            status.setText("You are moving the mouse!");
        }  
    }
}

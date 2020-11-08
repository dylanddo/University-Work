import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdapterClasses extends JFrame
{
    private JLabel status;
    private String details;

    public AdapterClasses()
    {
        super("Mouse Events");

        status = new JLabel("Default");
        add(status, BorderLayout.SOUTH);  // BorderLayout.SOUTH makes the label appear at the bottom of the screen.  
        addMouseListener(new MouseClass()); // Takes the class we created as a parameter.
    }

    private class MouseClass extends MouseAdapter
    // The MouseAdapter class allows us to overwrite only the methods you need to overwrite.
    {
        public void mouseClicked(MouseEvent event) 
        {
            details = String.format("You clicked %d ", event.getClickCount());

            if(SwingUtilities.isRightMouseButton(event))
            {
                details += "with right mouse button";
                // event.isMetaDown() doesn't work.
            }
            else if(SwingUtilities.isMiddleMouseButton(event))
            {
                details += "either centre mouse button";
                // event.isAltDown() doesn't work.
            }
            else
            {
                details += "with left mouse button";
            }

            status.setText(details);
        }  
    }
}

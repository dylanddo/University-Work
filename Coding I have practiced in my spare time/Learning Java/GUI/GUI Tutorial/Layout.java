import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout extends JFrame
// Extends JFrame means that CopyOfGUI inheriance all JFrame methods
// Also means instead of having to type stuff like frame.add(label) we can just type frame.add(label)
{
    private JButton lb, cb, rb;
    private FlowLayout layout;
    private Container container;

    public Layout()    // We treat the constuctor as a method.
    {
        super("Layout");    // Title
        // setLayout(new FlowLayout()); // Default layout
        // new FlowLayout(FlowLayout.LEFT)
        // new FlowLayout(FlowLayout.CENTER)
        // new FlowLayout(FlowLayout.RIGHT)
        
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        //Left
        lb = new JButton("Left");
        add(lb);
        // Annoymous inner class
        lb.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);   // Changes the entire layout to LEFT alignment.
                    layout.layoutContainer(container);  // This resets the container and rearranges everything depending on what our layout is.
                }
            }
        );

        
        //Centre
        cb = new JButton("Centre");
        add(cb);
        cb.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.CENTER);   // Changes the entire layout to CENTRE alignment.
                    layout.layoutContainer(container);  // This resets the container and rearranges everything depending on what our layout is.
                }
            }
        );
        
        
        //Right
        rb = new JButton("Right");
        add(rb);
        rb.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.RIGHT);   // Changes the entire layout to RIGHT alignment.
                    layout.layoutContainer(container);  // This resets the container and rearranges everything depending on what our layout is.
                }
            }
        );
    }
}

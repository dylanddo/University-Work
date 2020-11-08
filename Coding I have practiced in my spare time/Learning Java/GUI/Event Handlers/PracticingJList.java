import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*; // ListSelectionListener won't work without this.

// https://www.youtube.com/watch?v=vd-k2oBMXUI&list=PLFE2CE09D83EE3E28&index=68

public class PracticingJList extends JFrame
{
    private JList list;    
    private static String[] colourNames = {"Black", "Blue", "Red", "White"}; 
    private static Color[] colours = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

    public PracticingJList()    // We treat the constuctor as a method.
    {
        super("Title"); // Calls method from the super class JFrame
        setLayout(new FlowLayout()); // Default layout
        
        list = new JList(colourNames);  // Takes an array of the colour names.
        list.setVisibleRowCount(4);  // How many options the user can see by default. 
        // If we had 10 items for example but we only only for 4 by default there will be a scroll list.
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // The user can ONLY SELECT ONE thing in the list at a time.
        add(new JScrollPane(list)); // Adds the list with a scroll bar to the window.
        
        list.addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged(ListSelectionEvent event){
                    // We access the background through the content pane in order to change the background.
                    getContentPane().setBackground(colours[list.getSelectedIndex()]);
                }
            }
        );
    }
}

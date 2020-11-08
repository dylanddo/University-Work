import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// https://www.youtube.com/watch?v=vd-k2oBMXUI&list=PLFE2CE09D83EE3E28&index=68

public class PracticingJComboBox extends JFrame
{
    private JComboBox box;  // This is a drop down menu
    private JLabel picture; // Variable for the picture we want to appear next to the box.
    
    private static String[] filename = {"playstation.png", "xbox.png"}; // Array of filenames.
    
    // We get the filename from the String array filename and use that to get the actual icon.
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
    

    public PracticingJComboBox()    // We treat the constuctor as a method.
    {
        super("Title"); // Calls method from the super class JFrame
        setLayout(new FlowLayout()); // Default layout
        
        box = new JComboBox(filename);  // This will automatically put all the options in the filename array into a list.
        
        
        // We can create an annoymous inner class that implements ItemListener.
        // This means we don't have to create a whole other outside (handler) class.
        // new ItemListener() is an declaration for an annoymous class that implements item listener.
        // The only method that is needed is itemStateChanged().
        // event.getStateChange() == ItemEvent.SELECTED means if the button  was selected.
        // picture.setIcon() means that we will set a new icon  
        // pics[box.getSelectedIndex()] will use the index of the box to choose which image will be selected
        /// ...by assigning that index to pics e.g. picture.setIcon(pics[0]) which will be the playstation icon.
        
        box.addItemListener(    
            new ItemListener() {
                public void itemStateChanged(ItemEvent event){
                    if(event.getStateChange() == ItemEvent.SELECTED){
                        picture.setIcon(pics[box.getSelectedIndex()]);
                    }
                }
            }
        );
        
        add(box);
        picture = new JLabel(pics[0]);  // This will make image 1 the default image before we select anything.
        add(picture);
    }
}

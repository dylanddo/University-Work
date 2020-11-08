import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*; // ListSelectionListener won't work without this.

// https://www.youtube.com/watch?v=vd-k2oBMXUI&list=PLFE2CE09D83EE3E28&index=68

public class PracticingJListMutlipleSelectionList extends JFrame
{
    private JList leftList, rightList;  
    private JButton moveButton;
    private static String[] food = {"Bacon", "Wings", "Ham", "Beef", "More Bacon"};

    public PracticingJListMutlipleSelectionList()    // We treat the constuctor as a method.
    {
        super("Title"); // Calls method from the super class JFrame
        setLayout(new FlowLayout()); // Default layout
        
        leftList = new JList(food);  // Everyimte you use a JList it akes an arugement of an array.
        leftList.setVisibleRowCount(3);  // How many options the user can see by default. 
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // The user can only select MULTIPLE things in the list at a time.
        add(new JScrollPane(leftList)); // Adds the list with a scroll bar to the window.
        
        
        moveButton = new JButton("Move --->");
        moveButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    rightList.setListData(leftList.getSelectedValues());
                    // leftList.getSelectedValues() when ever we select something from the left list it creates an array of selected values and that array is passed
                    // into rightList.setListData() and this creates a list on the right hand size depending on what you selected on the list hand size.
                }
            }
        );
        
        add(moveButton);
        
        
        rightList = new JList(); // Because the rightList is emtpty it won't appear unless we set the width and height.
        rightList.setVisibleRowCount(3); 
        rightList.setFixedCellWidth(100);
        rightList.setFixedCellHeight(15);
        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); 
        add(new JScrollPane(rightList));
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;  // ChangeListener doesn't work without this.

public class TheWindow extends JFrame
{
    private JSlider slider;
    private DrawOval myPanel;

    public TheWindow()
    {
        super("Title");
        myPanel = new DrawOval();
        myPanel.setBackground(Color.ORANGE);

        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        //SwingConstants.HORIZONTAL - slider goes left or right.
        // The diameter can go no less than 0 and no more than 200.

        slider.setMajorTickSpacing(10);        
        // This method sets the major tick spacing. The number that is passed in represents the distance, measured in values, between each major tick mark. 
        // You will have a tick every 10 pixels.
        // The slider has a range 0 to 200 so we will get ticks: 0, 10, 20, 30, 40, 50... 190, 200.

        slider.setPaintTicks(true); // Makes ticks visible on the screen.

        // We add a listener to give it functionality.
        // ChangeListener() is used for sliders.
        // Every time we change our slider an event occurs and any time an event occurs a peice of code is executed.
        slider.addChangeListener(
            new ChangeListener(){
                public void stateChanged(ChangeEvent event){
                    myPanel.setD(slider.getValue());
                    // Gets the value of the slider and assigns it to D in the DrawOval class.
                }
            }
        );
        
        add(slider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}

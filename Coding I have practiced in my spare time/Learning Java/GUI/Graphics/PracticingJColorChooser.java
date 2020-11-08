import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Allows user to click a button and choose a colour.
public class  PracticingJColorChooser extends JFrame
{
    private JButton button;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public PracticingJColorChooser()
    {
        super("Title");
        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        button = new JButton("Choose a colour");
        button.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    color = JColorChooser.showDialog(null, "Pick your colour", color);   // Allows user to choose a colour.
                    // 1st parameter null is positioning which is centre.
                    // 2nd parameter  is the title of the window
                    // 3rd parameter is the colour that is selected by default when you open the window e.g. if you pick red when you open the window again red will
                    // ...be the default.
                    if(color == null)
                    {
                        color = (Color.WHITE);
                    }
                    panel.setBackground(color);
                }
            }
        );

        add(panel, BorderLayout.CENTER);    // panel will appear centre of the screen.
        add(button, BorderLayout.SOUTH);    // button will appear south of the screen.
        setSize(425, 150);
        setVisible(true);
    }
}

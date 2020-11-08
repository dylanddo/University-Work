import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel.*;
import java.awt.event.*;
/**
 * Write a description of class SimpleFrame here.
 *
 * @author D
 * @version Feb-2019
 */
public class Panels extends JFrame implements MouseListener, ActionListener
{
    private final int rows = 2;    
    private final int columns = 5;
    private final int GAP = 2;    
    private final int NUM = rows * columns; //Space between the panels
    private JPanel panelArray[] = new JPanel[NUM]; //an array of panels

    private JLabel gameStatus = new JLabel("");
    private JLabel gameDifficulty = new JLabel("Choose a difficulty then click play.");
    private JLabel setDiffculty = new JLabel("");
    private JLabel bombLabel = new JLabel("");

    private JPanel panel1 = new JPanel(new GridLayout(rows,columns, GAP,GAP)); 
    //Creates a layout that is with 2 rows and 5 columns with gaps between the panels.
    private JPanel panel2 = new JPanel();    
    private JPanel panel3 = new JPanel();

    private JButton playButton, exitButton;
    private JButton easyButton, intermediateButton, difficultButton;
    private int bomb = 0;

    private int tries = 0;  //Sets initial number of tries to 0.
    private int points = 0; //Sets initial points total to 0.
    private String greet;
    private String difficulty;
    private boolean[] clickedPanel; //Boolean array used to check if a panel has been clicked.
    private boolean gamePlayed = false; //The game is not active.

    public Panels()
    {
        super("Evade The Bomb");
        setSize(200,200);
        makeFrame();
    }

    public void makeFrame()
    {
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout());
        clickedPanel = new boolean[NUM];
        //panel1.setLayout(new BorderLayout()); ...Doesn't work with columns and rows

        playButton = new JButton("Play A Game");
        exitButton = new JButton("Exit");
        Font labelFont = new Font("Arial", Font.BOLD, 26);
        Font labelFont2 = new Font("Arial", Font.BOLD, 18);
        gameStatus.setFont(labelFont);
        gameDifficulty.setFont(labelFont2);
        setDiffculty.setFont(labelFont2);
        bombLabel.setFont(labelFont);

        easyButton = new JButton("Easy");
        intermediateButton = new JButton("Intermediate");
        difficultButton = new JButton("Difficult");

        add(panel1);
        for(int x = 0; x < NUM; x++) 
        {
            panelArray[x] = new JPanel(); //Sets the size of the panelArray to 10

            panelArray[x].addMouseListener(this); //Adds a mouseListener to each of these panels.    

            panel1.add(panelArray[x]); //All the panels in the panelArray are added to to panel1

            panelArray[x].setBackground(Color.RED); //Colours are set to red

            clickedPanel[x] = false; 
            //The boolean array with matching number is set to 0, verifying the fact the panel hasn't been clicked yet.
        }

        //panelArray[bomb].add(bombLabel);
        add(panel2, new FlowLayout());
        add(panel3);

        panel2.add(playButton);
        panel2.add(exitButton);
        panel2.add(gameStatus);

        panel3.add(easyButton);
        panel3.add(intermediateButton);
        panel3.add(difficultButton);
        panel3.add(gameDifficulty);
        panel3.add(setDiffculty);

        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.GREEN);

        //Adds an actionListener to all buttons so an action is performed when clicked.
        playButton.addActionListener(this);
        exitButton.addActionListener(this);
        easyButton.addActionListener(this);
        intermediateButton.addActionListener(this);
        difficultButton.addActionListener(this);

        panel1.addMouseListener(this);
        setVisible(true);
        setSize(1200, 600); //Sets the size of the window when panel is opened.
    }

    public void actionPerformed(ActionEvent e) //Step 3
    {
        Object source = e.getSource(); //very handy when you have multiple buttons

        if (source == playButton) 
        {
            for(int x = 0; x < NUM; x++) 
            {
                panelArray[x].setBackground(Color.RED); //When the playButton is clicked this resets the panel colours to red.
                points = 0; //Points is reset to 0.
                greet = "";
                gameStatus.setText(greet); //Label is reset to 0.
                clickedPanel[x] = false;
                gamePlayed = true;
            }
            bomb = (int)(Math.random()*10); //Generates a random number between 0 and 10.
            panelArray[bomb].add(bombLabel); //We add the Bomb (bombLabel) into the random panel that matches the randomly...
            //generated number.
        }

        //When the exitButton is clicked the program closes.
        if (source == exitButton)
        {
            System.exit(0);
        }

        //If the player selects the easyButton the nimber of tries is set to 5 and the player will be notified of the game...
        //difficulty.
        if (source == easyButton) 
        {
            tries = 5;
            difficulty = "Game Mode: Easy";
            setDiffculty.setText(difficulty);
        }

        //If the player selects the intermediateButton the nimber of tries is set to 7 and the player will be notified of...
        //the game difficulty.
        if (source == intermediateButton) 
        {
            tries = 7;
            difficulty = "Game Mode: Intermediate";
            setDiffculty.setText(difficulty);
        }

        //If the player selects the difficultButton the nimber of tries is set to 9 and the player will be notified of...
        //the game difficulty.
        if (source == difficultButton) 
        {
            tries = 9;
            difficulty = "Game Mode: Difficult";
            setDiffculty.setText(difficulty);
        }
    }

    public void mouseClicked(MouseEvent e) //Step 3
    {       
        Object source = e.getSource();

        if(gamePlayed && tries != 0)
        {
            if(source == panelArray[bomb])
            //Checks to see if the user has clicked on a panel with the bomb
            {
                //If the user has clicked on the panel with the bomb...
                panelArray[bomb].setBackground(Color.BLACK); //The panel is set to black.

                greet = "You lose! You got " + points + " points"; 

                gameStatus.setText(greet); //The label notifies the user that they lose and the number of points they have.

                gamePlayed = false; 
                //The gamePlayed is set to false, ending the game and preventing the user from clicking more panels.
            }
            else
            {
                for(int x = 0; x < NUM; x++)
                {
                    if(source == panelArray[x] && !clickedPanel[x])
                    //Checks to see if the  user clicks on a specific panel in the panelArray and clickedPanel is false.
                    {
                        panelArray[x].setBackground(Color.YELLOW);
                        points++;
                        greet = "Points: " + points;

                        gameStatus.setText(greet); //Notifies the user of the number of points they have.

                        clickedPanel[x] = true; //Sets clickedPanel to true so thus disabling the mouse listener on...
                        //that specific panel, preventing the colour from being changed and the points total increasing.
                        if(points == tries)
                        //When number of points matches the number of tries the player gets a message notifying them that...
                        //they won and the number of points they have.
                        {
                            greet = "You Won! You got " + points + " points";
                            gameStatus.setText(greet);
                            gamePlayed = false;
                            //The gamePlayed is set to false, ending the game and preventing the user from clicking more panels.
                        }
                    }
                }
            }
        }

    }

    public void mousePressed(MouseEvent e)
    {

    }

    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {

    }

}


import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingGraphics g = new DrawingGraphics();
        f.add(g);
        f.setSize(400, 250);
        f.setVisible(true);
    }
}

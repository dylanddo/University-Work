import javax.swing.*;

public class MainDrawingMoreGraphics
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingMoreGraphics g = new DrawingMoreGraphics();
        f.add(g);
        f.setSize(400, 250);
        f.setVisible(true);
    }
}

import javax.swing.JFrame;

public class Main
{
    public static void main(String[] args)
    {
        MouseEventHandling m = new MouseEventHandling();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(300,200);
        m.setVisible(true);
    }
}

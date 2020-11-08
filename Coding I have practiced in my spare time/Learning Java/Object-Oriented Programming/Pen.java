// This class represents a pen 

public class Pen
{
    //Pen description
    String type = "gel";
    String colour = "blue";
    int point = 10;           
    static boolean clicked = false; 
    
    //Action that can be performed
    public static void click()
    {
         clicked = true;
    }

    //Action that can be performed
    public static void unclick()
    {
        clicked = false;
    }
}

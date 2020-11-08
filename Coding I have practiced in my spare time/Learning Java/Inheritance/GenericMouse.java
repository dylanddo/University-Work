// The 3 mouses all have a scroll wheel and all have leftClick and rightClick. 
// At the same time each mouse has their own special features.
// Inheritance is a way to avoid repeating the same code e.g. if our mouse company grew we don't want to copy the same code
// ... a 100 times. 

//The GenericMouse will have everything that all of our mice will have.
public class GenericMouse
{
   public static void leftClick()
    {
        System.out.println("Click!");
    }
    
    public static void rightClick()
    {
        System.out.println("Click!");
    }  
    
    public static void scrollUp()
    {
        System.out.println("Scrolled up!");
    }  
    
    public static void scrollDown()
    {
        System.out.println("Scrolled down!");
    }  
}

// An interface is basically an outline for a class.
// An interface is like a class where we write the code outside.
// Any object or class in java has attributes and things it can do.
// So an interface is basically an outline on what to do.
// Everything in the interface has to be in the class.

interface WaterBottleInterface
{
    //attributes and actions
    String color = "Blue";
    
    void fillUp();
    void pourOut();
}

public class InterfaceExample implements WaterBottleInterface
{
    public static void main(String[] args)
    {
        System.out.println(color);
        
        InterfaceExample example = new InterfaceExample();
        example.fillUp();
    }
    
    public void fillUp()
    {
        System.out.println("Water bottle is filled up");
    }
    
    public void pourOut()
    {
        System.out.println("Water bottle is empty");
    }
}

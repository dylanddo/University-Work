// An enum is a list of things that doesn't change.
// It is like a combination of a class and an array.
// It is setUp like a class and you access it like a class.
// USE UPPERCASE FOR ENUMS.

// https://youtu.be/LYKHxwQ0QH8?t=299
public class LetsDoEnums2
{
    enum Flavor 
    {
        CHOCOLATE, VANILLA, STRAWBERRY;
    }

    public static void main(String[] args)
    {
        Flavor f = Flavor.CHOCOLATE;
        // Flavor l = new Flavor.ChOCOLATE; is wrong.

        if(f == f.CHOCOLATE)
        {
            System.out.println("It's chocolate");
        } 
        
        else if(f == f.VANILLA)
        {
            System.out.println("It's vanilla");
        } 
        
        else if(f == f.STRAWBERRY)
        {
            System.out.println("It's strawberry");
        }  
    }
}

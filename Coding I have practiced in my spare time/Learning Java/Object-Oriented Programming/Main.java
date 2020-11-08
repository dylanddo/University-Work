// All Object-Oriented Programming is, is taking taking real physical objects or making up objects that will help you and
// ... putting them into a computer just like this.
// An object has attributes and actions.
// For example the pen is a gel pen that is blue and has point 10 font
// OOP is making objects like that and using them throughout your code to create a result you want.

//www.youtube.com/watch?v=j0lBrYSlYaU&list=PL59LTecnGM1Pr-IoQS2JlTnEXOV28-KNg&index=2

public class Main
{
    public static void main(String[] args)
    {
        Pen p = new Pen();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Pen");
        System.out.println("---------------------------------------------------------------------------");
        //Attributes of the pen
        System.out.println("colour: " + p.colour);
        System.out.println("point: " + p.point);
        System.out.println("type: " + p.type);
        
        System.out.println("clicked: " + p.clicked);
        
        p.click();
        System.out.println("clicked: " + p.clicked);
        
        
        
        Headphones h = new Headphones();
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Headphones");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Volume: " + h.volume); 
        // Just volume instead of volume() because we aren't using a method we are using a field.
        
        h.volumeDown();
        System.out.println("Volume: " + h.volume);
        
        h.volumeUp();
        System.out.println("Volume: " + h.volume);
        
        h.volumeUp();
        System.out.println("Volume: " + h.volume);
    }
}

// An abstract is a bunch of variables and methods that can be used to create other classes
// Can't use an abstract class like a regular class. Anabstract helps create regular class.
// An abstract method is a method that isn't implemented yet. T

// An Interface assumes that all the methods are abstract which means not implemented (there is no code inside its just a list)  
// ...while an abstract class allows you to have a list of methods and methods that are already implemented.

abstract class Dog
{
    public void bark()
    {
        System.out.println("Bark!");
    }
    
    public abstract void poop();
}

class Chihuahua extends Dog
{
    // Chihuahua knows everything inside dog
    // It also knows that it needs to poop but doesn't know what to do since it isn't implemeneted yet (abstract method).
    // We implement it by creating the method
    public void poop()
    {
        System.out.println("Dog pooped!");
    }
}

public class Abstraction 
{
 public static void main(String[] args)
 {
     // We can now use Dog methods such as bark through the Chihuahua class
     Chihuahua c = new Chihuahua();
     c.bark();
     c.poop();
 }
}

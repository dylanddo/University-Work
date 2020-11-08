// Final ketword is the final value, you can't change this value.
// You should have final variables in all capitals in order to seperate it from normal variables.
public class Final
{
    final int MIX = 0;
    final int MAX = 10;    
    static final double PI = 3.14159;
    
    final int MEDIAN;
    
    public Final()
    {
        MEDIAN = 10;
    }
    
    public static void main(String[] args)
    {
        Final f = new Final();
        System.out.println(f.MAX);
        f.sayHi();
    }
    
    final public void sayHi()
    // The final means you can't create a metod with the same name.
    {
        System.out.println("Hi!");
    }
}

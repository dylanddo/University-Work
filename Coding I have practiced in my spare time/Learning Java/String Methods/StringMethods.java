//www.w3schools.com/java/java_ref_string.asp
public class StringMethods
{
    

    public static void main(String args[])
    {
        String[] words = {"Duck", "Funk", "Stay", "Bacon", "Bay", "Hay", "furry"};
        
        // Advance forloop allows us to iterate through an array.
        // It is going to take each represented as w and checks if it meets critera and then prints an output.
        for(String w: words)
        {
            if(w.endsWith("ay"))
            {       
                System.out.println(w + " ends with ay");
            }
        }
        
        for(String w: words)
        {
            if(w.startsWith("fu"))
            {       
                System.out.println(w + " starts with fu");
            }
        }
        
        for(String w: words)
        {
            if(w.contains("Duck"))
            {       
                System.out.println("Duck");
            }
        }
    }
}

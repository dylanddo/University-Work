import java.util.*; 

public class CreatingAFile
{
    public static void main(String[] args)
    {
        final Formatter x;  // outputs strings to a file
        
        try
        // Can't have try without catch or finally.
        {
            x = new Formatter("fred.txt"); // If there is no file to output to it will automatically create a new file.
            // Creates file is the same directory as the program unless you specify a path.
            System.out.println("You created a file!");
        }
        catch(Exception e) 
        // If you get an error what should we do?
        // This is a way of creating your own error instead of getting an error in a command prompt 
        // Essentially try this code if you get an error do this...
        {
           System.out.println("You got an error!"); 
        }
    }
}

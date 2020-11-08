import java.io.*;
import java.lang.*;
import java.util.*;

public class ReadFileNotWorking
{
    private Scanner x;
    
    public void openFile()
    {
        try
        // Can't have try without catch or finally.
        {
            x = new Scanner(new File("C:\\Users\\Dylan\\Google Drive\\Learning Java\\File Class\\test2.txt")); 
            // If there is no file to output to it will automatically create a new file.              
        }
        catch(Exception e) 
        // try this code if you get an error do this...
        {
           System.out.println("Could not find file!"); 
        }
    }
    
    public void readFile()
    {
        while(x.hasNext())
        // Built in method that loops through file until there is no input.
        // While loop turns false when there is nothing next.
        {
            String a = x.next();    // Numbers are assigned to a
            String b = x.next();    // First names are assigned to b
            String c = x.next();    // Last names are assigned to c
            
            System.out.printf("%s %s %s\n", a, b, c); // This will print all 3 variables on each line.
        }
    }
    
    public void closeFile()
    {
        x.close();
        // x.close() is a built in error.
        // This closes our file so nothing can write in it.
    }
}

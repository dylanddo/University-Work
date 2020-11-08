import java.io.*;
import java.lang.*;
import java.util.*;

public class WritingToFiles
{
    private Formatter x; 

    public void openFile()
    {
        try
        // Can't have try without catch or finally.
        {
            x = new Formatter("C:\\Users\\Dylan\\Google Drive\\Learning Java\\File Class\\test2.txt"); 
            // If there is no file to output to it will automatically create a new file.   
            System.out.println("File was created!"); 
        }
        catch(Exception e) 
        // try this code if you get an error do this...
        {
           System.out.println("You got an error!"); 
        }
    }
    
    public void writeToFile()
    {
        x.format("%s %s %s", "19", "Dylan", "Danga");
        // x.format() is built in file.
        // This inserts 3 Strings in our files.
        // x.format(format, args);
    }
    
    public void closeFile()
    {
        x.close();
        // x.close() is a built in error.
        // This closes our file so nothing can write in it.
    }
}


import java.io.File; 
// This doesn't create a text file. 
// This just gives information about files like the length, path, parent etc.
// It also checks if a file exists as we don't want to create the same file again.

// When we create a program with variables such as numbers or names once the program ends all these variables and methods are 
// ...all gone.
// if want to keep it in a database we should keep it in a text file so when we run the program again all the information is kept.

public class CheckingForFile
{
    public static void main(String[] args)
    {
        File x = new File("C:\\Users\\Dylan\\Google Drive\\Learning Java\\test.txt");
        // Use 2 backslashes when typing in file paths
        
        // getName() is a file method.
        if(x.exists())
        {
            System.out.println(x.getName() + " exists!");
        }
        else
        {
            System.out.println(x.getName() + " doesn't exist!");
        }
    }
}

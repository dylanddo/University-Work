import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CSVReader
{
    public static void main(String[] args)
    {
        String path = "C:\\Users\\Dylan\\Google Drive\\Learning Java\\File Class\\SacramentocrimeJanuary2006.csv";
        // Won't work without .csv
        // path is equal to the path of the CSV file.
        
        String line = "";
        
        try
        // We try to do the code here and if something goes wrong we are going to print out the error.
        {
            BufferedReader br = new BufferedReader(new FileReader(path));
            // Like a more efficient Scanner.
            // Creates a BufferedReader object.
            // Need to pass in a reader object to make the BufferedReader work (new FileReader).
            // FileReader is a type of reader.
            // FileReader constructor needs a String so we put in our string path.
            // Since the path is found on the computer we don't through a FileNotFoundException.
            
            while((line = br.readLine()) != null)
            // We read one line at a time and store it into the String line.
            // If the line is not null we know we have a line.
            // If something goes wrong we throw a IOException.
            {
                String[] values = line.split(",");
                // String array splits the line by commas.
                
                System.out.println("Date: " + values[0] + ", Crime description: " + values[5]);
                // Values[0] is the 1st column
                // Values[5] is the 6th column.
                
                // Once the last line is done we break out of the while loop.
                
                //System.out.println(line);
                //break;
            } 
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

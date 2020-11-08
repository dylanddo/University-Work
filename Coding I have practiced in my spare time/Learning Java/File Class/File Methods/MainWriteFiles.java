public class MainWriteFiles
{
    public static void main(String[] args)
    {
        WritingToFiles w = new WritingToFiles();
        w.openFile();
        w.writeToFile();
        w.closeFile();
    }
}

public class MainReadFile
{
    public static void main(String[] args)
    {
        ReadFileNotWorking r = new ReadFileNotWorking();
        r.openFile();   
        r.readFile();
        r.closeFile();
    }
}

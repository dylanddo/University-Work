public class Headphones
{
    String charge = "USB-C";
    String[] controls = {"power", "volume", "skip", "player/pause"};
    String colour = "black/black";    
    String brand = "beats";

    static boolean bluetooth = true;
    static boolean power = false;
    static boolean play = false;    
    static int volume = 5;
    static int maxVolume = 10;
    static int minVolume = 0;

    //Action that can be performed
    public static void powerOn()
    {
        power = true;
    }

    //Action that can be performed
    public static void powerOff()
    {
        power = false;
    }

    //Action that can be performed
    public static void play()
    {
        play = true;
    }

    //Action that can be performed
    public static void pause()
    {
        play = false;
    }

    //Action that can be performed
    public static void volumeUp()
    {
        if(volume < maxVolume)
        {
            volume++;
        }
    }

    //Action that can be performed
    public static void volumeDown()
    {
        if(volume > minVolume)
        {
            volume--;
        }        
    }
}

import java.util.Date;
import java.text.SimpleDateFormat;

// https://www.youtube.com/watch?v=6cp4P4XZ9hE&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz&index=6
// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
public class CurrentDateandTime
{
    public static void main(String[] args)
    {
        Date currentDate = new Date();
        System.out.println(currentDate);
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(currentDate));
        
        SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEE");
        // if the number of pattern letters is 4 or more, the full form is used.
        // SimpleDateFormat("E"); will just print off Wed for example.
        System.out.println(dayOfTheWeek.format(currentDate));
        
        SimpleDateFormat HourInAmPm = new SimpleDateFormat("hh:mm: a");
        System.out.println(HourInAmPm.format(currentDate));
    }
}

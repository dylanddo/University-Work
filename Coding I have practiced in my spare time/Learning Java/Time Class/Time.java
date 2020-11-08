public class Time
{
    private int hour, minute, second;
    
    public void setTime(int h, int m, int s)
    {
        hour = ((h >= 0 && h < 24) ? h : 0);
        // The question mark checks if these two conditions are met and if not by default put 0.
        
        minute = ((m >= 0 && m < 60) ? m : 0);
        
        second = ((s >= 0 && s < 60) ? s : 0);
    }
    
    public String displayMilitaryTime()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
        // return String.format(arg0, arg1)
        // This displays the hours at two decimal places then add a colon, then display the minutes at two decimal places 
        // ...then add a colon and then display seconds at two decimal places.
        //  "%02d:%02d:%d" gives you 13:27:6
        //  "%02d" makes sure the numbers start wtih two digits by default for example 00 instead of 0. So if you were to put in 20:06:07 you don't get 20:6:7.
    }
    
    public String display12HourTime()
    {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour%12), minute, second, (hour < 12? "AM" : "PM"));
        // ((hour == 0 || hour == 12) ?12 : hour%12) If hour is 0 or  12 put 12.
        // hour%12 (hour modulus 12) means if they put anything else we divide the number by 12 and give the remain the remainder so if it is 13 we put 1,
        // ...if it is 14 we put 2.
        // (hour < 12? "AM": "PM") If hour is less than 12 it is AM else it is PM.
    }
}

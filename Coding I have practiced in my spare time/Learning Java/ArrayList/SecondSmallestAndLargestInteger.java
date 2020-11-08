import java.util.*;
public class SecondSmallestAndLargestInteger
{
    public static int secondSmallestInteger()
    {
        ArrayList<Integer> data = new ArrayList<>();

        data.add(10);
        data.add(69);
        data.add(88);
        data.add(27);
        data.add(6);
        data.add(20);
        data.add(99);
        data.add(44);

        int lowest = data.get(0);
        int secondLowest = 0;
        int index = 0;
        for (int i = 0; i < data.size(); i++) 
        {
            // If we've found a new highest number...
            if (data.get(i) < lowest) 
            {

                // ...shift the current highest number to second highest
                secondLowest = lowest;

                // ...and set the new highest.
                lowest = data.get(i);
            } 
            else if (data.get(i) < secondLowest)
            {
                // Just replace the second highest
                secondLowest = data.get(i);                
            }
        }
        System.out.println(index);
        return secondLowest;
    }
    
    public static int secondLargestInteger()
    {
        ArrayList<Integer> data = new ArrayList<>();

        data.add(10);
        data.add(69);
        data.add(88);
        data.add(27);
        data.add(6);
        data.add(20);
        data.add(99);
        data.add(44);

        int highest = data.get(0);
        int secondHighest = 0;
        for (int i = 0; i < data.size(); i++) 
        {

            // If we've found a new highest number...
            if (data.get(i) > highest) 
            {

                // ...shift the current highest number to second highest
                secondHighest = highest;

                // ...and set the new highest.
                highest = data.get(i);
            } 
            else if (data.get(i) > secondHighest)
            {
                // Just replace the second highest
                secondHighest = data.get(i);
            }
        }
        return secondHighest;
    }
}

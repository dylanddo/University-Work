import java.util.*;
public class minimumInteger
{
    static ArrayList<Integer> data = new ArrayList<>();

    public static int getSmallestInteger()
    {
        data.add(10);
        data.add(69);
        data.add(88);
        data.add(27);
        data.add(5);
        data.add(20);
        data.add(99);
        data.add(44);

        int minInteger = data.get(0);
        for(int i = 1; i < data.size(); i++)
        {
            if(data.get(i) < minInteger) 
            {
                minInteger= data.get(i);
            }
        }
        return minInteger;
    }
}

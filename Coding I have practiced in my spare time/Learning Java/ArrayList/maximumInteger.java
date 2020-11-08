import java.util.*;
public class maximumInteger
{
    static ArrayList<Integer> data = new ArrayList<>();

    public static int getLargestInteger()
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

        int largestInteger = data.get(0);

        for(int i=1; i< data.size(); i++)
        {
            if((data.get(i)) > largestInteger)
            {
                largestInteger = data.get(i);
            }
        }
        return largestInteger;   
    }
}

import java.util.*;
public class SmallestAndSecondSmallest
{
    public static void x()
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
        
        int lowest  = data.get(0);
        Integer secondLowest = null;
        int index = 0;
        int index2 = 0;

        for( int i = 0; i < data.size() ; i++)
        {
            if(data.get(i) < lowest)
            {
                secondLowest = lowest;
                index2 = index;
                lowest = data.get(i);
                index = i;
            }
            else if(secondLowest == null || data.get(i) < secondLowest)
            {
                secondLowest = data.get(i);
                index2 = i;
            }
        }
        System.out.println("Index:  " + index + "    lowest: " + lowest);
        System.out.println("Index:  " + index2 + "    lowest: " + secondLowest);
    }
}

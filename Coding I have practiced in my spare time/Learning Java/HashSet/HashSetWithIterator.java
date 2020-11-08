import java.util.HashSet;
import java.util.Iterator;

public class HashSetWithIterator
{
    public static void main(String args[])
    {
        // HashSet order is random.
        HashSet<Integer> hashbrowns = new HashSet<Integer>();
        
        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);
        
        Object[] h = hashbrowns.toArray();
        System.out.println(h[0]);
        
        System.out.println(hashbrowns.hashCode());  // Returns sum of elements in the set.
        
        System.out.println();
        
        Iterator<Integer> it = hashbrowns.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

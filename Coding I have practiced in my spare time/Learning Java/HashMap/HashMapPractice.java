import java.util.HashMap;

public class HashMapPractice
{
    public static void main(String[] args)
    {
        // HashMaps don't have a specific order.
        
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        
        happy.put("a", 10);   // (key, value)
        happy.put("b", 3);
        happy.put("c", 88);        
        System.out.println(happy);
        
        System.out.println(happy.get("c")); // Returns the value
    }
}

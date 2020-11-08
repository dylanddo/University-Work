import java.util.HashSet;

public class HashSetPractice2
{
    public static void main(String args[])
    {
        HashSet<String> h = new HashSet<String>();
        h.add("Lemur");
        h.add("Orangatang");
        h.add("Spider-monkey");
        h.add("Silverback gorilla");

        System.out.println(h);
        
        System.out.println(h.size());
        
        System.out.println(h.contains("Spider-monkey"));
        
        h.remove("Orangatang");

        System.out.println(h);

        h.clear();

        System.out.println(h.isEmpty());

    }
}

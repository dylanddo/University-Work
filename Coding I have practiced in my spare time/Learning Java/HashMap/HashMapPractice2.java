import java.util.HashMap;

public class HashMapPractice2
{
    public static void main(String[] args)
    {
        // HashMaps don't have a specific order.
        
        HashMap<String, String> fun = new HashMap<String, String>();
        
        fun.put("bobbyJoe1996", "FluffyPonies!");
        fun.put("helloKittyFan21", "AloeVera?");
        fun.put("coolguyswag", "password123!");        
        System.out.println(fun);
        
        fun.remove("helloKittyFan21");        
        System.out.println(fun);
        
        System.out.println(fun.containsValue("password123"));
        System.out.println(fun.containsKey("coolguyswag"));
        
        System.out.println(fun.size());
        
        System.out.println(fun.replace("bobbyJoe1996", "betterPassword"));
        System.out.println(fun);
        
        System.out.println(fun.keySet());
        System.out.println(fun.values());
    }
}

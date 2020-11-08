import java.util.*;

//youtube.com/watch?v=GQWbUdb4d58&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF&index=41&t=44s
public class ArrayMethods
{
    public static void main(String args[])
    {
        int[] grades1 = {1, 2, 3, 72, 5};
        int[] grades2 = {1, 2, 3, 72, 5};
        
        if(Arrays.equals(grades1, grades2))
        // Arrays.equals(grades1, grades2) returns a boolean
        
        {
            System.out.println("The two arrays are equal");
        }
                        
        String[] grades = new String[5];
        System.out.println(Arrays.toString(grades));
        //System.out.println(grades) doesn't work for Array as you get [Ljava.lang.String;@1044be98 so you use 
        // ... Arrays.toString(grades) or System.out.printf("%s ", grades) in a forloop
        
        Arrays.fill(grades, "");
        // Without using Arrays.fill() we just get [null, null, null, null, null]
        // Arrays.fill() replaces all the nulls in grades with an empty string.
        
        List<String> testing = Arrays.asList(grades);
        // A list is a different way of storing data. 
    }
    
    
}

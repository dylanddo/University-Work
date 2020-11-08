import java.util.*;

// The list inherits all the methods from collections when we call the collection class.
public class ReverseAndCopy
{
    public static void main(String[] args)
    {
        Character[] ray= {'p', 'w', 'n'};
        List<Character> list1 = Arrays.asList(ray);
        System.out.println("List is: ");
        output(list1);

        //reverse and print out the list
        Collections.reverse(list1);
        System.out.println("After reverse: ");
        output(list1);

        //create new array and a new list
        Character[] ray2 = new Character[3];
        List<Character> list2 = Arrays.asList(ray2);

        //copy contents of list into list2
        Collections.copy(list2, list1); // copy is a method from the collection class
        // Collections.copy(desr, src); destination is where you want to copy it to and source is where you want to get the data from.
        System.out.println("Copy of the list: ");
        output(list2);

        // for(Character l: list1)
        // {
        // list2.add(l);
        // }
        // System.out.println("Copy of the list: ");
        // output(list2);

        //fill collections with crap
        Collections.fill(list1, 'x'); // fill is the same as replace, so anytime we encounter a character we replace it with x
        System.out.println("After filling the list: ");
        output(list1);        
    }

    //output method
    private static void output(List<Character> thelist)
    {
        for(Character thing: thelist)
        // Going to loop through each element in thelist and treat each element as thing.
        {
            System.out.printf("%s ", thing);
        }
        System.out.println();
    }
}

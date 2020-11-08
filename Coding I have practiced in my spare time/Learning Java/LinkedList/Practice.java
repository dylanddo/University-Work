import java.util.*;

// docs.oracle.com/javase/8/docs/api/java/util/List.html
// www.youtube.com/watch?v=rW2OppsgJjQ&list=PL27BCE863B6A864E3&index=7
// https://stackoverflow.com/questions/9265719/print-arraylist
// stackoverflow.com/questions/20140744/how-to-start-iterating-through-arraylist-from-set-index
public class Practice
{
    public static void main(String args[])
    {
        String[] things1 = {"apples", "noobs", "pwnge", "milk", "bacon", "goATS"};
        List<String> list1 = new LinkedList<String>();
        for(String x: things1)
        {
            list1.add(x);
        }

        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();
        for(String y: things2)
        {
            list2.add(y);
        }    

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeMe(list1, 2,5);
        printMe(list1);
        reverseMe(list1);
    }

    //printMe method
    public static void printMe(List<String> l1)
    {
        for(String b: l1)
        // An enhanced for loop that loop through the List and is going to treat each element in the lst as b
        {
            System.out.printf("%s ", b);
            // This will pass in each item of the list and just print that string with a space after it.
            // This is useful for printing stuff in a list.
            System.out.println();
        }
    }

    //removeMe method
    public static void removeMe(List<String> l1, int from, int to)
    // This will remove words in the index numbers from 2 ro 5.
    {
        l1.subList(from, to).clear();
        // subList(int fromIndex, int toIndex)    this is a built in List method from the Java Util.
        // clear() is a built in method used to remove items from a list.
    }

    //reverseMe method
    public static void reverseMe(List<String> l1)
    // This will remove words in the index numbers from 2 ro 5.
    {
        ListIterator<String> bobby = l1.listIterator(l1.size());
        // Putting l1.size in the parameter of l1.listIterator() makes the starting point the last index.
        // When you create a new Iterator or ListIterator the starting point is always index 0.
        while(bobby.hasPrevious())
        {
            System.out.printf("%s", bobby.previous());
        }
    }
}

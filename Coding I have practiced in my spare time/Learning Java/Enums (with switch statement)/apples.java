import java.util.EnumSet;

public class apples
{
    public static void main(String[] args)
    {
        for(Enumeration people: Enumeration.values())
        // Iterating through the Enumeration class.
        // We need to loop through an array...
        // Any time we make an Enumeration java automatically takes the constants and makes a built in array.
        {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());
            // \t makes a tab spacing.
            // \n skips a line.
            // people is the name e.g. bucky
            // people.getDesc() is the description e.g. nice.
            // people.getAge() is the age e.g. 22.
        }
        
        System.out.println("\nAnd now for the range of constants!!!\n");
        
        for(Enumeration people: EnumSet.range(Enumeration.kelsey, Enumeration.candy))
        // EnumSet.range(from, to)
        // It doesn't print the entire array, only the constants between kelsey and candy.
        {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());
            // \t makes a tab spacing.
            // \n skips a line.
            // people is the name e.g. bucky
            // people.getDesc() is the description e.g. nice.
            // people.getAge() is the age e.g. 22.
        }
    }
}

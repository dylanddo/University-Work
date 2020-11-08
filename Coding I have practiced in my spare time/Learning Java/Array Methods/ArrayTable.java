public class ArrayTable
{
    public static void main(String[] args)
    {
        System.out.println("Index\tValue"); // \t is just tab which is 5 spaces.
        String[] things = {"Egg", "Milk", "Butter", "Bread", "Cheese"};
        
        for(int i = 0; i < things.length; i++)
        {
            System.out.println(i + "\t" + things[i]);
        }
        
        System.out.println("\nAge\tName"); // \t is just tab which is 5 spaces.
        
        
        int[] age = {49, 44, 19, 18, 15, 10, 6};
        String[] name = {"Dad", "Mum", "Dylan", "Lilian", "Elsa", "Tiahna", "Precious"};
        
        for(int i = 0; i < age.length; i++)
        {
            System.out.println(age[i] + "\t" + name[i]);
        }
    }
}

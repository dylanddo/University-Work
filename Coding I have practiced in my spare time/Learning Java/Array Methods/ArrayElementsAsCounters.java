import java.util.Random;
// www.youtube.com/watch?v=pHxtKDENDdE&list=PLFE2CE09D83EE3E28&index=30
public class ArrayElementsAsCounters
{
    public static void main(String[] args)
    {
        Random dice = new Random();
        int freq[] = new int[7]; // The array size is 7 which has index 0 to 6. We want to include the number 6.
        
        for(int i = 1; i <= 1000; i++)
        {
            ++freq[1 + dice.nextInt(6)];
            // We created a number generator to roll numbers 0 to 5 and we add 1 so it is actually rolling 1 to 6.
            // This generates a random index from 1 to 6.
            // +freq[]; adds 1 to the number in the index in the array named freq.
            // For example if the random number would be 4, the code would look like this after execution:
            // ++freq[4];
            // That would then add 1 to the 5th place in the array.
            // Now the numbers would be 0, 0, 0, 0, 1 and 0.
            // if we get ++freq[4] again the numbers in the index will be 0, 0, 0, 0, 2 and 0.
            // 0, 0, 0, 0, 2 and 0 represent index 1 to 6 since we aren't adding numbers to index 0 because we don't want 
            // ...the get any results for index 0 since a dice has numbers 1 to 6 on iy.
            // This would run again for 1000 times, adding 1 number every time to a random place in the array.
            // Once the for loop has ran for 1000 times, the program moves on and prints the results to the console.
            
            
            
            
            //Example 
            // int array[] = new int[3]; has index 0, 1 and 2. 
            // The number in index 0 is 0, the number in index 1 is 0 and the number in index 2 is 0.
            // ++array[2];
            // That line of code would add 1 to the third and last number of the array (index place 2).
            // Now the numbers in the array would be 0, 0 and 1.
        }
        
        System.out.println("Face\tFrequency"); // Array table header.
        
        for(int i = 1; i < freq.length; i++)
        // Counter is starting from 1 not 0.
        // freq lengeth is 7 but since it is less than the counter goes up to 6
        {
            System.out.println(i + "\t" + freq[i]);
            // The counter represents the index 
            // freq[i] will display the number in that index (how many times we rolled numbers 1 to 6).
        }
    }
}

public class MathsStuff
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;
        
        System.out.println(Integer.max(x, y)); // Returns bigger value
        
        System.out.println(Integer.compare(x,y)); // Returns 0 if x == y, a value less than 0 if x < y and a value more than 0 if x > y
        // Similar to Integer.max(x, y) but you can use it for more stuff.
        
        String s = "300";        
       
        Integer.valueOf(s); // Returns an Integer (an object)
        Integer.parseInt(s); // Returns an int
        
        int a = 5;
        double b = (double) a /2;   // Make sure all the operands are the same data type you are trying to get.
        System.out.println(b);
        
        int c = 5 % 2;
        System.out.println(c);  // Returns remainder, in this case 1.
        
        System.out.println(Integer.MIN_VALUE);  // Returns the absolute min value for an integer (-2147483648)
        System.out.println(Integer.SIZE);   // Returns the size (32 bits or 4 bytes)
        
        System.out.println(Double.MAX_VALUE); 
        System.out.println(Double.POSITIVE_INFINITY); 
        System.out.println(Double.NaN); // Special value of double that is not a number
        System.out.println(Math.sqrt(1)); // Also not a number
        System.out.println(Double.isNaN(Math.sqrt(1))); // This to see if this is NaN (this outputs true)
        
        System.out.println(Math.pow(99999, 999999999)); // Returns -Infinity
        System.out.println(Math.pow(5, 2)); 
    }
}

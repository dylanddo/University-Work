//www.w3schools.com/java/java_ref_string.asp
public class StringMethods2
{
    public static void main(String args[])
    {
        String s = "buckyrobertsbuckyroberts";
        
        System.out.println(s.indexOf('k'));
        // This will search for the first instance of k.
        // The first instance is at index 3.
        
        System.out.println(s.indexOf('k', 5));
        // This will search for the first index of k but ingnore the first 5 letters.
        // Index 5 is used as the starting point.
        
        System.out.println(s.indexOf("rob"));
        // We can look for the first instance of sub strings.
        // The first instance is at index 5.
        
        System.out.println(s.indexOf("rob", 10));
        // Index 10 is used as the starting point.
        
        System.out.println(s.lastIndexOf("rob"));
        // We can look for the last instance of sub strings.
        
        System.out.println(s.charAt(s.length()-1)); // This will output last character
        System.out.println(s.charAt(7));
        
        String a = "Bacon";
        String b = "monster";
        System.out.println(a.concat(b));
        // String concatenation
        
        String c = "Duck";
        System.out.println(c.replace('D', 'F'));
        // This replaces D with F.
        
        System.out.println(c.toUpperCase());
        
        String d = "            doge";
        System.out.println(d.trim());
        // Removes all whitespaces.
        
    }
}

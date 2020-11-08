public class MainForShoe
{
    public static void main(String[] args)
    {
        Shoe s = new Shoe("Nike", 12); // The constructor of Shoe has paramters so we must put in parameters.
        System.out.println("Brand: " + s.brand);
        
        // Walking extends Shoe so it knows the goreTex, brand and size.        
        Walking w = new Walking(true, "Nike", 12);
        System.out.println("Gore-tex: " + w.goreTex);
        
        // Running extends Shoe so it knows the weight, brand and size.
        Running r = new Running(4.5, "Nike", 12);
        System.out.println("Weight: " + r.weight);
    }
}

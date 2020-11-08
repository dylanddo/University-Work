public class Walking extends Shoe
// extends Shoe makes Walking a subclass of Shoe.
// Shoe is the superclass.
// Shoe has brand and size in the constructor so Walking requires brand and size as well.
{
    public final boolean goreTex;
    
    public Walking(boolean goreTex, String brand, double size)
    {
        super(brand, size); // this super must be first since we need to create a shoe object first.
        this.goreTex = goreTex;
    }
}

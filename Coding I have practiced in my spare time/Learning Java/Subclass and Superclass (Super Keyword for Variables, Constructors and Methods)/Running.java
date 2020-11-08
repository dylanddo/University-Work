public class Running extends Shoe
// extends Shoe makes Running a subclass of Shoe.
// Shoe is the superclass.
// Shoe has brand and size in the constructor so Running requires brand and size as well.
{
    public final double weight;
    
    public Running(double weight, String brand, double size)
    {
        super(brand, size); // this super must be first since we need to create a shoe object first.
        this.weight = weight;
    }
}

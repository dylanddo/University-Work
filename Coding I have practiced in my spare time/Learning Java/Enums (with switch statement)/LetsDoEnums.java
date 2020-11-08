// An enum is a list of things that doesn't change.
// It is like a combination of a class and an array.
// It is setUp like a class and you access it like a class.
// USE UPPERCASE FOR ENUMS.

// https://youtu.be/LYKHxwQ0QH8?t=299
enum levels 
{
    LOW, MEDIUM, HIGH;
}

public class LetsDoEnums
{
    public static void main(String[] args)
    {
        levels l = levels.LOW;

        // A switch is basically an if statment
        switch(l)
        // The switch statment takes the variable in its parameter and tests it. 
        // The switch statment goes through the cases to see what value that variable is equal to. 
        // It checks to see if the variable l is low, then medium and then high and if it isn't then it goes to the default.
        {
            case LOW:   // if the level is low
                System.out.println("Low level"); // We print this message
                break;

            case MEDIUM:   // if the level is medium
                System.out.println("medium level"); // We print this message
                break;

            case HIGH:   // if the level is high
                System.out.println("high level"); // We print this message
                break;
            
            default:    // If the level selected isn't low, medium or high the default selected difficulty is extreme.
                System.out.println("Extreme level");
            break;
        }
    }
}

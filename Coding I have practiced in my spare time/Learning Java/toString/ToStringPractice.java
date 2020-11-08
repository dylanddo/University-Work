// toString helps you print a object.

public class ToStringPractice
{
    private String name;
    private int age;
    
    public ToStringPractice(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public String toString()
    {
        return name + " " + age;
    }
}

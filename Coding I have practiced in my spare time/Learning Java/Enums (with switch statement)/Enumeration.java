public enum Enumeration
{
    // Variables that never change.    
    // Enumeration are constants that are also objects.    
    bucky("nice", "19"),    // values(desc, age)
    kelsey("cutie", "20"),
    julia("mistake", "21"),
    nicole("italian", "22"),
    candy("different", "23"),
    maya("bruh", "24");
    
    
    private final String desc;
    private final String age;
    
    // First thing we want to do is create an Enumation constructor.
    Enumeration(String desc, String age)
    {
        this.desc = desc;
        this.age = age;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public String getAge()
    {
        return age;
    }
}

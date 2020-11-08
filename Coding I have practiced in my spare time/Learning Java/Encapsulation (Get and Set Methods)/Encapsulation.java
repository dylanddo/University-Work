// Encapsulation is basically using methods to set variables in a class.
// The point of encapsulation is to abstract the variable from the  user to make it simpler to the user. So variables should
// ...not be shown to the user. The global variables must be private.

// https://youtu.be/cU94So54cr8?t=297
public class Encapsulation
{
    private String firstName;
    private String lastName;
    private int age;
    private int studentID;
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getStudentID()
    {
        return studentID;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
}

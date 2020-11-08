public class Main
{
 public static void main(String[] args)
 {
     Encapsulation e = new Encapsulation();
     
     e.setFirstName("Dylan");
     System.out.println(e.getFirstName());
     
     e.setLastName("Danga");
     System.out.println(e.getLastName());
     
     System.out.println(e.getFullName());
     
     e.setAge(20);
     System.out.println(e.getAge());
     
     e.setStudentID(19887474);
     System.out.println(e.getStudentID());
 }
}

public class Main
{
  public static void main(String[] args)
  {
      Time t = new Time();
      System.out.println(t.displayMilitaryTime());  // Default is 00:00:00
      System.out.println(t.display12HourTime());
      
      t.setTime(13, 27, 6);
      System.out.println(t.displayMilitaryTime());
      System.out.println(t.display12HourTime());
  }
}

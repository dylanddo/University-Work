public class Main
{
 public static void main(String[] args)
 {
     Mouse1 m1 = new Mouse1();
     Mouse2 m2 = new Mouse2();
     Mouse3 m3 = new Mouse3();
     
     // Because mouse1 inherits from GenericMouse we can see all the methods it can perform.
     m1.leftClick();
     m3.rightClick();
     m1.scrollUp();
     m2.scrollDown();
     
     m2.connect();
 }
}

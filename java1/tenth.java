package java1;
import java.util.Scanner;
public class tenth {
    public static void main (String [] args)
    {
      int x,y,z;
      System.out.println("Enter three enteger");
      Scanner scan = new Scanner (System.in);
      x = scan.nextInt();
      y = scan.nextInt();
      z = scan.nextInt();
      if ( x>y && x>z)
      System.out.println("First is largest number");
      else if ( y>x && y>z)
      System.out.println("Second is largest number");
      else if ( z>x && z>y)
      System.out.println("Third is the largest number");
      else 
        System.out.println("Entered numbered is not distinct");
    }
}

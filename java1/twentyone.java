package java1;
//while loop program.
import java.util.Scanner;
public class twentyone {
    public static void main(String [] args)
    {
      int n;
      System.out.println("Enter an integer");
      Scanner scan = new Scanner(System.in);
      while (( n = scan.nextInt()) != 0)
      {
        System.out.println("You entered"+n);
        System.out.println("Eneter a number");
      }
      System.out.println("Out of loop");
    }
}

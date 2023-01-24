package java1;
import java.util.Scanner;
public class fourteen {
      public static void main(String [] args)
      {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        x = scan.nextInt();
        if (x % 2 == 0)
        System.out.println("Entered number is even");
        else
        System.out.println("Entered number is odd");
      }

}

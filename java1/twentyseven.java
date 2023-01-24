package java1;
// to print table of any integer.
import java.util.Scanner;
public class twentyseven {
    public static void main(String[] args)
    {
        int n,c;
      System.out.println("Enter an integer to print it's multiplication table:");
      Scanner scan = new Scanner (System.in);
       n = scan.nextInt();
       System.out.println("Multiplication table of"+n+"is:-");
       for ( c = 1; c<=10; c++)
       {
        System.out.println(n+"*"+c+ "=" +(n*c));
       }
    }
}

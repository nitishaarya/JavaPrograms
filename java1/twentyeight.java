package java1;
//for any range of tables.
import java.util.Scanner;
public class twentyeight {
    public static void main(String [] args)
    {
       int a,b,c,d;
       System.out.println("Enter the range of numbers to print their multiplication table:");
       Scanner scan = new Scanner(System.in);
       a = scan.nextInt();
       b = scan.nextInt();
       for ( c = a; c <= b; c++)
       {
        System.out.println("Multiplication table of"+c);
        for ( d = 1; d <=10; d++)
        {
            System.out.println(c+"*"+d+"="+(c*d));
        }
       }
         
    }
}

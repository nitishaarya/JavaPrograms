package java1;
import java.util.Scanner;
public class fifteen {
    public static void main(String [] args)
    {
        int n,i,fact = 1;
        System.out.println("Enter an integer to find out it's factorial:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if (n<0)
        System.out.println("Number should be non-negative");
        else {
            for (i = 1; i<n; i++)
            {
                fact = fact*i;
                 System.out.println("Factorial of"+n+"is ="+fact);
            }
        }
    }
}

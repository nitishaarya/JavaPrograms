package java1;
//while loop using break statement.
import java.util.Scanner;
public class twentythree {
    public static void main (String [] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter an inetger");
            n = scan.nextInt();
            if (n == 0)
            {
                break;
            }
            System.out.println("You entered"+n);
        }
    }
}



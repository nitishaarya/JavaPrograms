package java1;
import java.util.Scanner;
public class eighth {
    public static void main(String [] args)
    {
        int x,y,z;
        System.out.println("Enter the two integer to calculate their sum:");
        Scanner scan = new Scanner (System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        z = x+y;
        System.out.println("The sum of entered integer is:"+z);
    }
}

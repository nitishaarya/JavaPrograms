package java1;
import java.util.Scanner;
public class sixth {
    public static void main(String[] args)
    {
        int x,y,z;
        System.out.println("Enter x and y");
        Scanner scan = new Scanner (System.in);
        x = scan. nextInt();
        y = scan.nextInt();
        System.out.println("Before swapping\n x="+x+"\ny="+y);
       z = x;
       x = y;
       y = z;
       System.out.println("After swapping\n x="+x+"\ny="+y);
    }
}
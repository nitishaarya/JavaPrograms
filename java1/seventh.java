package java1;
import java.util.Scanner;
public class seventh {
    public static void main(String[] args)
    {
       int x,y;
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter x and y:");
       x = scan.nextInt();
       y = scan.nextInt();
       System.out.println("Before swapping\n x="+x+"\n y="+y);
       x = x + y;
       y = x - y;
       x = x - y;
       System.out.println("After Sapping\n x ="+ x +"\n y ="+y);

    }

}

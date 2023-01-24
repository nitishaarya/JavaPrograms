package java1;
import java.util.Scanner;
public class fourth {
    public static void main(String[] args)
    {
        int a; float b; String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        s = scan.nextLine();
        System.out.println("You entered a String:"+s);
        System.out.println("Enter an integer:");
        a = scan.nextInt();
        System.out.println("You entered an integer:"+a);
        System.out.println("Enter a Float:");
        b = scan.nextFloat();
        System.out.println("You entered a float:"+b);
    }
}

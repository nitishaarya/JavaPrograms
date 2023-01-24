package java1;
import java.util.Scanner;
public class strfirst {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the String:");
        String str = scan.next();
        String temp = "";
        for (int i = str.length() - 1; i>= 0; i--)
        {
            temp = temp + str.charAt(i);
        }
        if ( str.equals(temp))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String us not palindrome");
        }
    }
}

package java1;
import java.util.Scanner;
public class strsecond {
    public static void main(String [] args)
    {   int uc = 0;
        int lc = 0;
        int digit = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.next();
        for (int i = 0; i < str.length() ; i++)
        {
            if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                ++uc;
            }
            else if ( str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                ++lc;
            }
            else if ( str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                ++digit;
            }
        }
        System.out.println("The count of upper case is:"+uc);
        System.out.println("The count of lower case is:"+lc);
        System.out.println("The count of digit is:"+digit);

    }
}

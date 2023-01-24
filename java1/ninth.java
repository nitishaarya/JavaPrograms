package java1;
import java.util.Scanner;
import java.math.BigInteger;
public class ninth {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        String number1, number2;
        System.out.println("Enter the first large number");
        number1 = scan.nextLine();
        System.out.println("Enter the second large number");
        number2 = scan.nextLine();
        BigInteger first = new BigInteger(number1); 
        BigInteger second = new BigInteger(number2); 
        BigInteger sum;
        sum = first.add(second);
        System.out.println("Result of addition = " + sum);
    }
}

package java1;
import java.util.Scanner;
import java.math.BigInteger;
public class sixteen {
    public static void main(String [] args)
    {
        int n,i;
        BigInteger inc = new BigInteger("1"); BigInteger fact = new BigInteger("1");
        Scanner scan = new Scanner (System.in);
         System.out.println("Enter an integer:");
         n = scan.nextInt();
         for ( i = 1; i <= n; i++)
         {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
         }
         System.out.println(n + "! = " + fact);
    }
}

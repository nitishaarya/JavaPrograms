package java1;

import java.util.Scanner;
public class eighteen {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int n;
        System.out.println("Enter an integer");
        n = scan.nextInt();
        for(int i = 0; i<=n; i++)
        {
             System.out.print(i+" ");
        }
    }
}

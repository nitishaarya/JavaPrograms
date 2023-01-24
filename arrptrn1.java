import java.util.Scanner;
public class arrptrn1 
{
         public static void main(String [] args)
         {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        for ( int i = 0; i < n; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                if ( i == 0 ||
                j == 0 ||
                i == n/2 ||
                j == n/2 ||
                i == j ||
                i+j == n-1 ||
                i == n-1 ||
                j == n-1 ||
                i == n/4 ||
                j == n/4 ||
                i == 3*n/4 ||
                j == 3*n/4  )
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     }
    
}
